package irvine.oeis.a011;

import irvine.oeis.LinearRecurrence;

/**
 * A011916.
 * @author Sean A. Irvine
 */
public class A011916 extends LinearRecurrence {

  /** Construct the sequence. */
  public A011916() {
    super(new long[] {1, -15, 15}, new long[] {0, 3, 44});
  }
}
