package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029547 Expansion of <code>1/(1-34*x+x^2)</code>.
 * @author Sean A. Irvine
 */
public class A029547 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029547() {
    super(new long[] {-1, 34}, new long[] {1, 34});
  }
}
