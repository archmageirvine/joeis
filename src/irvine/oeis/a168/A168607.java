package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168607 <code>3^n + 2</code>.
 * @author Sean A. Irvine
 */
public class A168607 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168607() {
    super(new long[] {-3, 4}, new long[] {3, 5});
  }
}
