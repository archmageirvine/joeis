package irvine.oeis.a342;
// manually 2023-09-29/gcd3an at 2023-10-03 20:19

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000010;
import irvine.oeis.a003.A003415;

/**
 * A342415 a(n) = phi(n) / gcd(phi(n),A003415(n)), where A003415(n) is the arithmetic derivative of n, and phi is Euler totient function.
 * @author Georg Fischer
 */
public class A342415 extends AbstractSequence {

  private int mN = 0;
  private final AbstractSequence mSeq1 = new A000010().skip(1);
  private final AbstractSequence mSeq2 = new A003415().skip(2);

  /** Construct the sequence. */
  public A342415() {
    super(1);
  }

  @Override
  public Z next() {
    return (++mN == 1) ? Z.ONE : new Q(mSeq1.next(), mSeq2.next()).num();
  }
}

