package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.a006.A006577;

/**
 * A070976 Number of steps to reach 1 in '3x+1' (or Collatz) problem starting with 3^n.
 * @author Sean A. Irvine
 */
public class A070976 extends AbstractSequence implements DirectSequence {

  private static final DirectSequence A006577 = new A006577();

  /** Construct the sequence. */
  public A070976() {
    super(0);
  }

  private Z mA = null;

  @Override
  public Z a(final int n) {
    return A006577.a(Z.valueOf(n));
  }

  @Override
  public Z a(final Z n) {
    return A006577.a(n);
  }

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(3);
    return A006577.a(mA);
  }
}
