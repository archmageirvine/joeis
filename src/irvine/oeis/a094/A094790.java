package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094790 Number of (s(0), s(1), ..., s(2n)) such that <code>0 &lt;</code> s(i) <code>&lt; 7</code> and |s(i) - s(i-1)| <code>= 1</code> for i <code>= 1,2,</code>....,2n, s(0) <code>= 1,</code> s(2n) <code>= 3</code>.
 * @author Sean A. Irvine
 */
public class A094790 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094790() {
    super(new long[] {1, -6, 5}, new long[] {1, 3, 9});
  }
}
