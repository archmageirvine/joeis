package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155645.
 * @author Sean A. Irvine
 */
public class A155645 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155645() {
    super(new long[] {42, -55, 14}, new long[] {1, 12, 84});
  }
}
