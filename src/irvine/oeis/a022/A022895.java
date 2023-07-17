package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022895 Number of solutions to c(1)*prime(1) + ... + c(n)*prime(n) = 1, where c(i) = +-1 for i &gt; 1, c(1) = 1.
 * @author Sean A. Irvine
 */
public class A022895 extends A022894 {

  /** Construct the sequence. */
  public A022895() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return get(1L, ++mN);
  }
}
