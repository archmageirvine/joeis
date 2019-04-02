package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083217 (2*5^n+(-1)^n)/3.
 * @author Sean A. Irvine
 */
public class A083217 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083217() {
    super(new long[] {5, 4}, new long[] {1, 3});
  }
}
