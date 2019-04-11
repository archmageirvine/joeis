package irvine.oeis.a263;

import irvine.oeis.LinearRecurrence;

/**
 * A263536 Row sum of <code>an</code> equilateral triangle tiled with the <code>3,4,5</code> Pythagorean triple.
 * @author Sean A. Irvine
 */
public class A263536 extends LinearRecurrence {

  /** Construct the sequence. */
  public A263536() {
    super(new long[] {-1, 1, 0, 1}, new long[] {5, 7, 12, 17});
  }
}
