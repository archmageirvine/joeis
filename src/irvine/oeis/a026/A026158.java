package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026158 a(n) = T(3n,n), where T is the array in A026148.
 * @author Sean A. Irvine
 */
public class A026158 extends A026148 {

  /** Construct the sequence. */
  public A026158() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return get(3 * ++mN, mN);
  }
}
