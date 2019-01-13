package irvine.oeis.a280;

import irvine.oeis.LinearRecurrence;

/**
 * A280072.
 * @author Sean A. Irvine
 */
public class A280072 extends LinearRecurrence {

  /** Construct the sequence. */
  public A280072() {
    super(new long[] {1, -21, 21}, new long[] {1, 11, 210});
  }
}
