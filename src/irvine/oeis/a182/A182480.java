package irvine.oeis.a182;

import irvine.oeis.LinearRecurrence;

/**
 * A182480 Decimal expansion of <code>16000000/63</code>.
 * @author Sean A. Irvine
 */
public class A182480 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182480() {
    super(new long[] {1, -1, 0, 1}, new long[] {2, 5, 3, 9});
  }
}
