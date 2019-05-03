package irvine.oeis.a205;

import irvine.oeis.LinearRecurrence;

/**
 * A205087 <code>a(n)=n 7</code>'s sandwiched between two <code>1</code>'s.
 * @author Sean A. Irvine
 */
public class A205087 extends LinearRecurrence {

  /** Construct the sequence. */
  public A205087() {
    super(new long[] {-10, 11}, new long[] {11, 171});
  }
}
