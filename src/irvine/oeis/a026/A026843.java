package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026843 a(n) = T(2n,n+3), T given by A026725.
 * @author Sean A. Irvine
 */
public class A026843 extends A026725 {

  /** Construct the sequence. */
  public A026843() {
    super(3);
  }

  private long mN = 2;

  @Override
  public Z next() {
    return get(2 * ++mN, mN + 3);
  }
}
