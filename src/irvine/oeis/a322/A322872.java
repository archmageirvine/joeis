package irvine.oeis.a322;
// Generated by gen_seq4.pl 2025-03-31.ack/ordtraf at 2025-03-31 23:38

import irvine.oeis.a171.A171462;
import irvine.oeis.transform.OrdinalTransformSequence;

/**
 * A322872 Ordinal transform of A171462, where A171462(n) = n - A052126(n).
 * @author Georg Fischer
 */
public class A322872 extends OrdinalTransformSequence {

  /** Construct the sequence. */
  public A322872() {
    super(1, new A171462());
  }
}

