package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026305 a(n) = T(2n,n-1), where T is the array in A026300.
 * @author Sean A. Irvine
 */
public class A026305 extends A026300 {

  /** Construct the sequence. */
  public A026305() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return t(2 * ++mN, mN - 1);
  }
}
