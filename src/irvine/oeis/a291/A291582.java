package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291582 Maximum number of 6 sphinx tile shapes in a sphinx tiled hexagon of order <code>n</code>.
 * @author Sean A. Irvine
 */
public class A291582 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291582() {
    super(new long[] {1, -3, 3}, new long[] {30, 132, 306});
  }
}
