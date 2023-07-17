package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026392 T(n,[ n/2 ]), where T is the array in A026386.
 * @author Sean A. Irvine
 */
public class A026392 extends A026386 {

  /** Construct the sequence. */
  public A026392() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return get(++mN, mN / 2);
  }
}
