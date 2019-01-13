package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253920.
 * @author Sean A. Irvine
 */
public class A253920 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253920() {
    super(new long[] {1, -1, 0, -1442, 1442, 0, 1}, new long[] {1, 5, 39, 760, 6494, 55518, 1095199});
  }
}
