package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A074663.
 * @author Sean A. Irvine
 */
public class A074481 extends A000040 {

  private long mP = 1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= mP) {
      mP = super.next().longValueExact();
      mM = 1;
    }
    return Functions.REVERSE.z(mM, mP).isProbablePrime() ? Z.ONE : Z.ZERO;
  }
}

