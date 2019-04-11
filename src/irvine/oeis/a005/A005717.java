package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a001.A001006;

/**
 * A005717 Construct triangle in which n-th row is obtained by expanding <code>(1 + x + x^2)^n</code> and take the next-to-central column.
 * @author Sean A. Irvine
 */
public class A005717 extends A001006 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().multiply(++mN);
  }
}
