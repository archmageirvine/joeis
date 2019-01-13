package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129929.
 * @author Sean A. Irvine
 */
public class A129929 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129929() {
    super(new long[] {2, -5, 10, -10, 5}, new long[] {1, 2, 4, 7, 11});
  }
}
