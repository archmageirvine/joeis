package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022993 <code>37-n</code>.
 * @author Sean A. Irvine
 */
public class A022993 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022993() {
    super(new long[] {-1, 2}, new long[] {37, 36});
  }
}
