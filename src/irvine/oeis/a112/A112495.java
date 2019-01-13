package irvine.oeis.a112;

import irvine.oeis.LinearRecurrence;

/**
 * A112495.
 * @author Sean A. Irvine
 */
public class A112495 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112495() {
    super(new long[] {-12, 52, -91, 82, -40, 10}, new long[] {3, 25, 130, 546, 2037, 7071});
  }
}
