package irvine.oeis.a316;

import irvine.oeis.FiniteSequence;

/**
 * A316412 Positive numbers m so that deletion of some or none but not all digits from m yields a noncomposite number.
 * @author Georg Fischer
 */
public class A316412 extends FiniteSequence {

  /** Construct the sequence. */
  public A316412() {
    super(1, 2, 3, 5, 7, 11, 13, 17, 23, 31, 37, 53, 71, 73, 113, 131, 137, 173, 311, 317);
  }
}
