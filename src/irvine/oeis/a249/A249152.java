package irvine.oeis.a249;

import irvine.oeis.DoubledSequence;

/**
 * A249152 Exponent of 2 in the hyperfactorials: a(n) = A007814(A002109(n)).
 * @author Georg Fischer
 */
public class A249152 extends DoubledSequence {

  /** Construct the sequence. */
  public A249152() {
    super(0, new A249153());
  }
}
