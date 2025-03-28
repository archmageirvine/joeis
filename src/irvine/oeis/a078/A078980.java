package irvine.oeis.a078;
// Generated by gen_seq4.pl 2025-03-12.ack/cfnum at 2025-03-12 21:05

import irvine.oeis.a073.A073742;
import irvine.oeis.cons.ContinuedFractionNumeratorSequence;

/**
 * A078980 Numerators of continued fraction convergents to sinh(1).
 * @author Georg Fischer
 */
public class A078980 extends ContinuedFractionNumeratorSequence {

  /** Construct the sequence. */
  public A078980() {
    super(0, new A073742());
  }
}
