package irvine.oeis.a369;
// Generated by gen_seq4.pl 2025-01-01.ack/moetraf at 2025-01-01 23:25

import irvine.oeis.a083.A083345;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A369068 M\u00f6bius transform of A083345, where A083345(n) = n' / gcd(n,n'), and n' stands for the arithmetic derivative of n, A003415.
 * @author Georg Fischer
 */
public class A369068 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A369068() {
    super(1, new A083345(), 0);
    next();
  }
}
