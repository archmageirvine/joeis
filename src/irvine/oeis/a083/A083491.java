package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A083491 Multiples of 3 in which there is no common digit in successive terms.
 * @author Sean A. Irvine
 */
public class A083491 extends Sequence0 {

  private final long mS;
  private Z mA = Z.ZERO;

  protected A083491(final long s) {
    mS = s;
  }

  /** Construct the sequence. */
  public A083491() {
    this(3);
  }

  @Override
  public Z next() {
    final int syn = Functions.SYNDROME.i(mA);
    while (true) {
      mA = mA.add(mS);
      if ((Functions.SYNDROME.i(mA) & syn) == 0) {
        return mA;
      }
    }
  }
}
