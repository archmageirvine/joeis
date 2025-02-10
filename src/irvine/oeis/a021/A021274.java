package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021274 Expansion of g.f. 1/((1 - x)*(1 - 2*x)*(1 - 8*x)*(1 - 11*x)).
 * @author Sean A. Irvine
 */
public class A021274 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021274() {
    super(new long[] {-176, 302, -147, 22}, new long[] {1, 22, 337, 4482});
  }
}
