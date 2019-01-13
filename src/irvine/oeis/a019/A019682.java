package irvine.oeis.a019;

import irvine.oeis.LinearRecurrence;

/**
 * A019682.
 * @author Sean A. Irvine
 */
public class A019682 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019682() {
    super(new long[] {360, -166, 23}, new long[] {1, 23, 363});
  }
}
