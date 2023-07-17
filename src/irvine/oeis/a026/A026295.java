package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026295 a(n) = T(2n,n-1), where T is the array in A026268.
 * @author Sean A. Irvine
 */
public class A026295 extends A026268 {

  /** Construct the sequence. */
  public A026295() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 1);
  }
}
