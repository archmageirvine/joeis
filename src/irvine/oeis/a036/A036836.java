package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036836 Schoenheim bound L_1(n,9,8).
 * @author Sean A. Irvine
 */
public class A036836 extends A036831 {

  /** Construct the sequence. */
  public A036836() {
    super(9);
  }

  private long mN = 8;

  @Override
  public Z next() {
    return l(++mN, 9, 8, 1);
  }
}
