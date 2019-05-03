package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060101 Sixth column <code>(m=5)</code> of triangle <code>A060098</code>.
 * @author Sean A. Irvine
 */
public class A060101 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060101() {
    super(new long[] {1, -6, 10, 10, -50, 34, 66, -110, 0, 110, -66, -34, 50, -10, -10, 6}, new long[] {1, 6, 26, 86, 246, 622, 1442, 3102, 6292, 12122, 22374, 39754, 68354, 114114, 185614, 294866});
  }
}
