package irvine.oeis.a129;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A129024 The first 8 values are predefined, the remaining set to a(n) = 24*prime(n).
 * @author Georg Fischer
 */
public class A129024 extends A000040 {

  protected int mN = 0;
  private static final int[] INITS = {0, 3, 15, 24, 48, 72, 120, 168, 264};

  @Override
  public Z next() {
    ++mN;
    final Z result = super.next();
    return mN < INITS.length ? Z.valueOf(INITS[mN]) : result.multiply(24);
  }
}
