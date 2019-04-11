package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094836 <code>a(n) = 2702*a(n-1) - a(n-2)</code>; <code>a(-1) = -15</code>; <code>a(0) = 15</code>.
 * @author Sean A. Irvine
 */
public class A094836 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094836() {
    super(new long[] {-1, 2702}, new long[] {-15, 15});
  }
}
