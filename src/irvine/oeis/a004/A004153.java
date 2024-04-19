package irvine.oeis.a004;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000142;

/**
 * A004153 Factorial numbers written backwards.
 * @author Sean A. Irvine
 */
public class A004153 extends A000142 implements DirectSequence {

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    return Functions.REVERSE.z(Functions.FACTORIAL.z(n));
  }

  @Override
  public Z next() {
    return Functions.REVERSE.z(super.next());
  }
}
