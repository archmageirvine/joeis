package irvine.oeis.a009;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A009545 E.g.f. sin(x)*exp(x).
 * @author Sean A. Irvine
 */
public class A009545 extends LinearRecurrence {

  /** Construct the sequence. */
  public A009545() {
    super(new long[] {-2, 2}, new long[] {0, 1});
  }
}

