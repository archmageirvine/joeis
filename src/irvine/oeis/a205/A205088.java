package irvine.oeis.a205;

import irvine.oeis.LinearRecurrence;

/**
 * A205088 <code>a(n)=n 8</code>'s sandwiched between two <code>1</code>'s.
 * @author Sean A. Irvine
 */
public class A205088 extends LinearRecurrence {

  /** Construct the sequence. */
  public A205088() {
    super(new long[] {-10, 11}, new long[] {11, 181});
  }
}
