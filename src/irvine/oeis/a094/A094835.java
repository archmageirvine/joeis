package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094835 <code>a(n) = 2702*a(n-1) - a(n-2)</code>; <code>a(-1) = a(0) = 26</code>.
 * @author Sean A. Irvine
 */
public class A094835 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094835() {
    super(new long[] {-1, 2702}, new long[] {26, 26});
  }
}
