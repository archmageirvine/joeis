package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198769 <code>(9*5^n-1)/4</code>.
 * @author Sean A. Irvine
 */
public class A198769 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198769() {
    super(new long[] {-5, 6}, new long[] {2, 11});
  }
}
