package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000043;

/**
 * A072073 Number of solutions to cototient(x) = A051953(x) = 2^n.
 * @author Sean A. Irvine
 */
public class A072073 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mM = 0;
  private final Sequence mMersenne = new A000043();
  private long mS = mMersenne.next().longValueExact();

  @Override
  public Z next() {
    if (++mM == mS) {
      mS = mMersenne.next().longValueExact();
      mA = mA.add(1);
    }
    return mA;
  }
}
