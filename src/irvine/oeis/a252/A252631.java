package irvine.oeis.a252;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A252631 Numbers n such that the heptagonal number H(n) is equal to the sum of the hexagonal numbers X(m), X(m+1), X(m+2) and X(m+3) for some m.
 * @author Sean A. Irvine
 */
public class A252631 extends LinearRecurrence {

  /** Construct the sequence. */
  public A252631() {
    super(new long[] {1, -323, 323}, new long[] {92, 29524, 9506540});
  }
}
