package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059142 A hierarchical sequence (S(W2{3}*) - see A059126).
 * @author Sean A. Irvine
 */
public class A059142 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A059142() {
    super(new long[] {2, -5, 4}, new long[] {11, 40, 105});
  }
}

