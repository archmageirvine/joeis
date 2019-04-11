package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083594 <code>(7-4(-2)^n)/3</code>.
 * @author Sean A. Irvine
 */
public class A083594 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083594() {
    super(new long[] {2, -1}, new long[] {1, 5});
  }
}
