package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030438 a(n) = A030019(n)*n! (or A035051*(n-1)!).
 * @author Sean A. Irvine
 */
public class A030438 extends A030019 {

  private Z mF = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return super.next().multiply(mF);
  }
}

