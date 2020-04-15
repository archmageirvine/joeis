package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031210 Numbers having <code>period-92 7-digitized</code> sequences.
 * @author Sean A. Irvine
 */
public class A031210 extends A031200 {

  private static final Z Z92 = Z.valueOf(92);

  @Override
  public Z next() {
    while (!Z92.equals(super.next())) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
