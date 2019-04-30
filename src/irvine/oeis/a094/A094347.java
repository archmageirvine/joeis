package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094347 <code>a(n) = 14*a(n-1) - a(n-2); a(0) = a(1) = 2</code>.
 * @author Sean A. Irvine
 */
public class A094347 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094347() {
    super(new long[] {-1, 14}, new long[] {2, 2});
  }
}
