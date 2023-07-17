package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026850 a(n) = T(2n,n+1), T given by A026736.
 * @author Sean A. Irvine
 */
public class A026850 extends A026736 {

  /** Construct the sequence. */
  public A026850() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN, mN + 1);
  }
}
