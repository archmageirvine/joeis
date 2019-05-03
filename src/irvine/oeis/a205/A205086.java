package irvine.oeis.a205;

import irvine.oeis.LinearRecurrence;

/**
 * A205086 <code>a(n) = n 6</code>'s sandwiched between two <code>1</code>'s.
 * @author Sean A. Irvine
 */
public class A205086 extends LinearRecurrence {

  /** Construct the sequence. */
  public A205086() {
    super(new long[] {-10, 11}, new long[] {11, 161});
  }
}
