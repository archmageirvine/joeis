package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026851 a(n) = T(2n,n+2), T given by A026736.
 * @author Sean A. Irvine
 */
public class A026851 extends A026736 {

  /** Construct the sequence. */
  public A026851() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN + 2);
  }
}
