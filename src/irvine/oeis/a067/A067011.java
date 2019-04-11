package irvine.oeis.a067;

import irvine.oeis.LinearRecurrence;

/**
 * A067011 <code>a(2n)</code> and <code>a(2n+1)</code> are side lengths of a Beentjes sequence of perfect squared rectangles, starting with <code>a 33</code> X 32 rectangle.
 * @author Sean A. Irvine
 */
public class A067011 extends LinearRecurrence {

  /** Construct the sequence. */
  public A067011() {
    super(new long[] {9, 0, 22, 0}, new long[] {33, 32, 683, 781});
  }
}
