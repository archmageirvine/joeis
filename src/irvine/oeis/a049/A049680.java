package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049680.
 * @author Sean A. Irvine
 */
public class A049680 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049680() {
    super(new long[] {1, -2, -3, 4}, new long[] {2, 2, 5, 11});
  }
}
