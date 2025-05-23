package irvine.oeis.a344;
// Generated by gen_seq4.pl 2025-03-31.ack/ordtraf at 2025-03-31 23:38

import irvine.oeis.a342.A342915;
import irvine.oeis.transform.OrdinalTransformSequence;

/**
 * A344771 Ordinal transform of A342915, where A342915(n) = gcd(1+n, psi(n)).
 * @author Georg Fischer
 */
public class A344771 extends OrdinalTransformSequence {

  /** Construct the sequence. */
  public A344771() {
    super(1, new A342915());
  }
}

