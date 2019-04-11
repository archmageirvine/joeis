package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094789 Number of (s(0), s(1), ..., s(2n+1)) such that <code>0 &lt;</code> s(i) <code>&lt; 7</code> and |s(i) - s(i-1)| <code>= 1</code> for i <code>= 1,2,</code>....,2n+1, s(0) <code>= 1,</code> s(2n+1) <code>= 4</code>.
 * @author Sean A. Irvine
 */
public class A094789 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094789() {
    super(new long[] {1, -6, 5}, new long[] {1, 4, 14});
  }
}
