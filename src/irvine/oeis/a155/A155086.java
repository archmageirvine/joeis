package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155086.
 * @author Sean A. Irvine
 */
public class A155086 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155086() {
    super(new long[] {-1, 1, 1}, new long[] {5, 8, 18});
  }
}
