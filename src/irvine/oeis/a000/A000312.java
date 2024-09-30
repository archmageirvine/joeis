package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A000312 a(n) = n^n; number of labeled mappings from n points to themselves (endofunctions).
 * @author Sean A. Irvine
 */
public class A000312 extends Sequence0 implements DirectSequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(mN);
  }

  @Override
  public Z a(final Z n) {
    return n.pow(n);
  }

  @Override
  public Z a(final int n) {
    return Z.valueOf(n).pow(n);
  }

}
