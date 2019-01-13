package irvine.oeis.a112;

import irvine.oeis.LinearRecurrence;

/**
 * A112027.
 * @author Sean A. Irvine
 */
public class A112027 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112027() {
    super(new long[] {-3, 0, 0, 0, 4, 0, 0, 0}, new long[] {1, 2, 1, 3, 7, 8, 4, 6});
  }
}
