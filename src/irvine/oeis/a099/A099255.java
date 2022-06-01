package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099255 G.f. (7+6*x-6*x^2-3*x^3)/((x^2+x-1)*(x^2-x-1)).
 * @author Sean A. Irvine
 */
public class A099255 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099255() {
    super(new long[] {-1, 0, 3, 0}, new long[] {7, 6, 15, 15});
  }
}
