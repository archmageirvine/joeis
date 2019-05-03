package irvine.oeis.a252;

import irvine.oeis.LinearRecurrence;

/**
 * A252631 Numbers n such that the heptagonal number <code>H(n)</code> is equal to the sum of the hexagonal numbers <code>X(m), X(m+1), X(m+2)</code> and <code>X(m+3)</code> for some m.
 * @author Sean A. Irvine
 */
public class A252631 extends LinearRecurrence {

  /** Construct the sequence. */
  public A252631() {
    super(new long[] {1, -323, 323}, new long[] {92, 29524, 9506540});
  }
}
