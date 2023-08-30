package irvine.oeis.a094;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A094259 Expansion of g.f.: (1-5*x)/((1-6*x)*(1-x)^2).
 * @author Sean A. Irvine
 */
public class A094259 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094259() {
    super(new long[] {6, -13, 8}, new long[] {1, 3, 11});
  }
}
