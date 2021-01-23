package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168579 G.f.: 1/(1-x-16*x^2).
 * @author Sean A. Irvine
 */
public class A168579 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168579() {
    super(new long[] {16, 1}, new long[] {1, 1});
  }
}
