package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081340 <code>(5^n+(-1)^n)/2</code>.
 * @author Sean A. Irvine
 */
public class A081340 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081340() {
    super(new long[] {5, 4}, new long[] {1, 2});
  }
}
