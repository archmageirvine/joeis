package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022896 Number of solutions to c(1)*prime(1) + ... + c(n)*prime(n) = 2, where c(i) = +-1 for i&gt;1, c(1) = 1.
 * @author Sean A. Irvine
 */
public class A022896 extends A022894 {

  /** Construct the sequence. */
  public A022896() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return get(0L, ++mN);
  }
}
