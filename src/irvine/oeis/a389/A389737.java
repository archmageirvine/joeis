package irvine.oeis.a389;
// manually chatest2/sintrif at 2026-06-07 21:28

import irvine.oeis.a051.A051336;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A389737 Number of subsets of {1..n} forming a finite arithmetic progression.
 * @author Georg Fischer
 */
public class A389737 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A389737() {
    super(0, (term, n) -> term.add(1), "", new A051336().prepend(0));
  }
}
