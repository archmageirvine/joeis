package irvine.oeis.a205;

import irvine.oeis.LinearRecurrence;

/**
 * A205085 <code>a(n) = n 5</code>'s sandwiched between two <code>1</code>'s.
 * @author Sean A. Irvine
 */
public class A205085 extends LinearRecurrence {

  /** Construct the sequence. */
  public A205085() {
    super(new long[] {-10, 11}, new long[] {11, 151});
  }
}
