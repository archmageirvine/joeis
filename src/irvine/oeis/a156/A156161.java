package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156161.
 * @author Sean A. Irvine
 */
public class A156161 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156161() {
    super(new long[] {1, -35, 35}, new long[] {289, 7225, 243049});
  }
}
