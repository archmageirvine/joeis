package irvine.oeis.a134;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A134884 Expansion of g.f. -x*(8844*x^4 +8509*x^3 -137*x^2 -209*x +3)/((67*x^2 +67*x +1)*(134*x^3 +137*x -1)).
 * @author Sean A. Irvine
 */
public class A134884 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134884() {
    super(1, new long[] {8978, 8978, 9313, 9112, 70}, new long[] {3, 1, 27269, 1954390, 385327519});
  }
}
