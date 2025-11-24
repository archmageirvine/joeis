package irvine.oeis.a390;

import irvine.math.z.Z;

/**
 * A390130 Number of 4-partitions of the fan graph F_{1,n} where every triangle uses exactly 2 parts.
 * @author Sean A. Irvine
 */
public class A390130 extends A390491 {

  private int mN = 5;

  /** Construct the sequence. */
  public A390130() {
    super(6);
  }

  @Override
  public Z next() {
    ++mN;
    return t(mN - 1, 3).subtract(t(mN - 1, 2).multiply2()).add(t(mN - 1, 1)).divide2();
  }
}
