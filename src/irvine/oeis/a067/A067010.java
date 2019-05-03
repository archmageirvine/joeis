package irvine.oeis.a067;

import irvine.oeis.LinearRecurrence;

/**
 * A067010 <code>a(2n)</code> and <code>a(2n+1)</code> are side lengths of a Beentjes sequence of perfect squared rectangles, starting with a <code>32 X 33</code> rectangle.
 * @author Sean A. Irvine
 */
public class A067010 extends LinearRecurrence {

  /** Construct the sequence. */
  public A067010() {
    super(new long[] {9, 0, 22, 0}, new long[] {32, 33, 682, 779});
  }
}
