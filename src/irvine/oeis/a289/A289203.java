package irvine.oeis.a289;

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A289203 Number of maximum independent vertex sets in the n X n knight graph.
 * @author Georg Fischer
 */
public class A289203 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A289203() {
    super(0, new long[] {-1, -1, 0, -1, -5, 1, 4}, new long[] {-1, 0, 1});
  }
}
