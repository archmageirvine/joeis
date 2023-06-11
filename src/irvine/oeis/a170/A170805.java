package irvine.oeis.a170;

import irvine.math.z.Z;

/**
 * A170805 a(n) = A170803(n-1) + 2, with a(0) = 1, a(1) = 2.
 * @author Georg Fischer
 */
public class A170805 extends A170803 {

  private int mN = -1;

  @Override
  public int getOffset() {
    return 0;
  }

  @Override
  public Z next() {
    return (++mN <= 1) ? Z.valueOf(mN + 1) : super.next().add(Z.TWO);
  }
}
