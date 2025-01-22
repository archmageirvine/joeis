package irvine.oeis.a006;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A006370 The Collatz or 3x+1 map: a(n) = n/2 if n is even, 3n + 1 if n is odd.
 * @author Sean A. Irvine
 */
public class A006370 extends Sequence0 implements DirectSequence {

  private long mN = -1;

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z a(final Z n) {
    return Functions.COLLATZ.z(n);
  }

  @Override
  public Z next() {
    return Functions.COLLATZ.z(++mN);
  }
}
