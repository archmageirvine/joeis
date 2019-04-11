package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041857 Denominators of continued fraction convergents to <code>sqrt(450)</code>.
 * @author Sean A. Irvine
 */
public class A041857 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041857() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 39202, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 4, 5, 14, 61, 136, 197, 924, 39005, 156944, 195949, 548842, 2391317, 5331476, 7722793, 36222648});
  }
}
