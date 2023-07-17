package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026094 a(n) = T(n,[ n/2 ]), where T is the array defined in A026082.
 * @author Sean A. Irvine
 */
public class A026094 extends A026082 {

  /** Construct the sequence. */
  public A026094() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN / 2);
  }
}

