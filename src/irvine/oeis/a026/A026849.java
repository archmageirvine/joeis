package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026849 a(n) = T(2n,n-3), T given by A026736.
 * @author Sean A. Irvine
 */
public class A026849 extends A026736 {

  /** Construct the sequence. */
  public A026849() {
    super(3);
  }

  private long mN = 2;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 3);
  }
}
