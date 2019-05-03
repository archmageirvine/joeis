package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121205 <code>"666"</code> in bases 7 and higher rewritten in base 10.
 * @author Sean A. Irvine
 */
public class A121205 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121205() {
    super(new long[] {1, -3, 3}, new long[] {342, 438, 546});
  }
}
