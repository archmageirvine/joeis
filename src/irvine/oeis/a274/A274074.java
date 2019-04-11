package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274074 <code>a(n) = 6^n+(-1)^n</code>.
 * @author Sean A. Irvine
 */
public class A274074 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274074() {
    super(new long[] {6, 5}, new long[] {2, 5});
  }
}
