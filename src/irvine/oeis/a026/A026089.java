package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026089 a(n) = T(2n,n), where T is the array defined in A026082.
 * @author Sean A. Irvine
 */
public class A026089 extends A026082 {

  /** Construct the sequence. */
  public A026089() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}

