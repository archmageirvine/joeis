package irvine.oeis.a106;

import irvine.oeis.FiniteSequence;

/**
 * A106037 Special highly composite numbers: a highly composite number (A002182) that divides all larger highly composite numbers.
 * @author Georg Fischer
 */
public class A106037 extends FiniteSequence {

  /** Construct the sequence. */
  public A106037() {
    super(1, 2, 6, 12, 60, 2520);
  }
}
