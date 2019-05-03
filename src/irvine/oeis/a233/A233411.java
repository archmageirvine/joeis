package irvine.oeis.a233;

import irvine.oeis.LinearRecurrence;

/**
 * A233411 The number of length n binary words with some prefix which contains two more <code>1</code>'s than <code>0</code>'s or two more <code>0</code>'s than <code>1</code>'s.
 * @author Sean A. Irvine
 */
public class A233411 extends LinearRecurrence {

  /** Construct the sequence. */
  public A233411() {
    super(new long[] {-4, 2, 2}, new long[] {0, 0, 2});
  }
}
