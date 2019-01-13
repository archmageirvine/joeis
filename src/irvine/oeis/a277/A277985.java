package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277985.
 * @author Sean A. Irvine
 */
public class A277985 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277985() {
    super(new long[] {1, -3, 3}, new long[] {6, 24, 204});
  }
}
