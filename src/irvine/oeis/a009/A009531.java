package irvine.oeis.a009;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A009531 Expansion of the e.g.f. sin(x)*(1+x).
 * @author Sean A. Irvine
 */
public class A009531 extends LinearRecurrence {

  /** Construct the sequence. */
  public A009531() {
    super(new long[] {-1, 0, -2, 0}, new long[] {0, 1, 2, -1});
  }
}

