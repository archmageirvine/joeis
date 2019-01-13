package irvine.oeis.a112;

import irvine.oeis.LinearRecurrence;

/**
 * A112742.
 * @author Sean A. Irvine
 */
public class A112742 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112742() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 4, 24, 80});
  }
}
