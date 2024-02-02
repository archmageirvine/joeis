package irvine.oeis.a068;

import irvine.math.z.Z;

/**
 * A068187 a(n) is the smallest number such that the product of its decimal digits equals n^n, or 0 if no solutions exist.
 * @author Sean A. Irvine
 */
public class A068187 extends A068189 {

  private long mN = 0;

  @Override
  public Z next() {
    return a(Z.valueOf(++mN).pow(mN));
  }
}
