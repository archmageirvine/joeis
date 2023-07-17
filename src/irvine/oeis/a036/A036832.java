package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036832 Schoenheim bound L_1(n,5,4).
 * @author Sean A. Irvine
 */
public class A036832 extends A036831 {

  /** Construct the sequence. */
  public A036832() {
    super(5);
  }

  private long mN = 4;

  @Override
  public Z next() {
    return l(++mN, 5, 4, 1);
  }
}
