package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026682 a(n) = A026681(2n,n).
 * @author Sean A. Irvine
 */
public class A026682 extends A026681 {

  /** Construct the sequence. */
  public A026682() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
