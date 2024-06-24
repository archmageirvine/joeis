package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A007089 Numbers in base 3.
 * @author Sean A. Irvine
 */
public class A007089 extends Sequence0 implements DirectSequence {

  private long mN = -1;

  @Override
  public Z next() {
    return new Z(Long.toString(++mN, 3));
  }

  @Override
  public Z a(final Z n) {
    return new Z(n.toString(3));
  }

  @Override
  public Z a(final int n) {
    return new Z(Integer.toString(n, 3));
  }

}
