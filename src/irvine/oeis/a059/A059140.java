package irvine.oeis.a059;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A059140 A hierarchical sequence (S(W2{2}*c) - see A059126).
 * @author Sean A. Irvine
 */
public class A059140 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A059140() {
    super(new long[] {2, -5, 4}, new long[] {4, 15, 40});
  }
}

