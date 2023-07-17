package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026091 a(n) = T(4n,n), where T is the array defined in A026082.
 * @author Sean A. Irvine
 */
public class A026091 extends A026082 {

  /** Construct the sequence. */
  public A026091() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return get(4 * ++mN, mN);
  }
}

