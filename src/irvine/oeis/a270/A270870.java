package irvine.oeis.a270;

import irvine.oeis.LinearRecurrence;

/**
 * A270870.
 * @author Sean A. Irvine
 */
public class A270870 extends LinearRecurrence {

  /** Construct the sequence. */
  public A270870() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {5, 215, 1311, 5531, 18329, 50775, 122675});
  }
}
