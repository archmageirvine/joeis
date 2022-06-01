package irvine.oeis.a059;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A059162 A hierarchical sequence (S(W'2{3}*c) - see A059126).
 * @author Sean A. Irvine
 */
public class A059162 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059162() {
    super(new long[] {-4, 4}, new long[] {12, 48});
  }
}
