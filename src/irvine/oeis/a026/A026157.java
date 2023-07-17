package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026157 a(n) = T(2n,n), where T is the array in A026148.
 * @author Sean A. Irvine
 */
public class A026157 extends A026148 {

  /** Construct the sequence. */
  public A026157() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
