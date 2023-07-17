package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026153 T(n,n-2), where T is the array in A026148.
 * @author Sean A. Irvine
 */
public class A026153 extends A026148 {

  /** Construct the sequence. */
  public A026153() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    return get(++mN, mN - 2);
  }
}
