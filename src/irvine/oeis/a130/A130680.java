package irvine.oeis.a130;

import irvine.oeis.FiniteSequence;

/**
 * A130680 Numbers n such that <code>n =</code> (a_1 + a_2 <code>+ </code>... + a_p)*(a_1^3 + a_2^3 <code>+ </code>... + a_p^3), where n has the decimal expansion a_1a_2...a_p.
 * @author Georg Fischer
 */
public class A130680 extends FiniteSequence {

  /** Construct the sequence. */
  public A130680() {
    super(1, 1215, 3700, 11680, 13608, 87949);
  }
}
