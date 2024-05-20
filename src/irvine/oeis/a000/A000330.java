package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A000330 Square pyramidal numbers: a(n) = 0^2 + 1^2 + 2^2 + ... + n^2 = n*(n+1)*(2*n+1)/6.
 * @author Sean A. Irvine
 */
public class A000330 extends Sequence0 implements DirectSequence {

  protected long mN = -1;

  @Override
  public Z next() {
    return Functions.PYRAMIDAL.z(++mN);
  }

  @Override
  public Z a(final Z n) {
    return Functions.PYRAMIDAL.z(mN);
  }

  @Override
  public Z a(final int n) {
    return Functions.PYRAMIDAL.z(mN);
  }
}

