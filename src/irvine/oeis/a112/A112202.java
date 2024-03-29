package irvine.oeis.a112;
// Generated by gen_seq4.pl rootet/rooteta at 2023-01-21 23:59

import irvine.oeis.AddFiniteSequence;
import irvine.oeis.a058.A058626;
import irvine.oeis.transform.RootSequence;

/**
 * A112202 McKay-Thompson series of class 60d for the Monster group.
 * <code>T60d = sqrt(T30e-2),where T30e = A058626</code>
 * @author Georg Fischer
 */
public class A112202 extends RootSequence {

  /** Construct the sequence. */
  public A112202() {
    super(0, new AddFiniteSequence(1, new A058626(), -2), 1, 2);
  }
}
