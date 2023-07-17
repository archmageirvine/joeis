package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026857 a(n) = T(2n+1,n+4), T given by A026736.
 * @author Sean A. Irvine
 */
public class A026857 extends A026736 {

  /** Construct the sequence. */
  public A026857() {
    super(3);
  }

  private long mN = 2;

  @Override
  public Z next() {
    return get(2 * ++mN + 1, mN + 4);
  }
}
