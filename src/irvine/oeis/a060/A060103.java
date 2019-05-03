package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060103 Fourth column <code>(m=3)</code> of triangle <code>A060102</code>.
 * @author Sean A. Irvine
 */
public class A060103 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060103() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 13, 71, 259, 742, 1806, 3906});
  }
}
