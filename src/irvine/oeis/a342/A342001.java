package irvine.oeis.a342;
// manually 2024-06-20

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.a003.A003557;

/**
 * A342001 Arithmetic derivative without its inherited divisor; the arithmetic derivative of n divided by A003557(n), which is a common divisor of both n and A003415(n).
 * @author Georg Fischer
 */
public class A342001 extends AbstractSequence implements DirectSequence {

  private static final DirectSequence A003557 = new A003557();
  private int mN;

  /** Construct the sequence. */
  public A342001() {
    super(1);
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    return Functions.ARD.z(mN).divide(A003557.a(mN));
  }

  @Override
  public Z a(final Z n) {
    return Functions.ARD.z(n).divide(A003557.a(n));
  }

  @Override
  public Z a(final int n) {
    return Functions.ARD.z(n).divide(A003557.a(n));
  }

}
