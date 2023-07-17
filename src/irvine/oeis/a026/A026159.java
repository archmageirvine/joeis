package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026159 T(4n,n), where T is the array in A026148.
 * @author Sean A. Irvine
 */
public class A026159 extends A026148 {

  /** Construct the sequence. */
  public A026159() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return get(4 * ++mN, mN);
  }
}
