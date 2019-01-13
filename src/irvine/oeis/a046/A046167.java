package irvine.oeis.a046;

import irvine.oeis.LinearRecurrence;

/**
 * A046167.
 * @author Sean A. Irvine
 */
public class A046167 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046167() {
    super(new long[] {2788484181840L, -325685329164L, 16299368820L, -453096049, 7555800, -75586, 420},
      new long[] {0, 0, 0, 0, 0, 1, 420});
  }
}
