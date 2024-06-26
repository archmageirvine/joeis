package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A000030 Initial digit of n.
 * @author Sean A. Irvine
 */
public class A000030 extends Sequence0 implements DirectSequence {

  private int mN = -1;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    return Z.valueOf(n.toString(10).charAt(0) - '0');
  }

  @Override
  public Z a(final int n) {
    return Z.valueOf(String.valueOf(n).charAt(0) - '0');
  }

}

