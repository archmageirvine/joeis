package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199412 <code>(9*6^n+1)/5</code>.
 * @author Sean A. Irvine
 */
public class A199412 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199412() {
    super(new long[] {-6, 7}, new long[] {2, 11});
  }
}
