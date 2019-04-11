package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022991 <code>35-n</code>.
 * @author Sean A. Irvine
 */
public class A022991 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022991() {
    super(new long[] {-1, 2}, new long[] {35, 34});
  }
}
