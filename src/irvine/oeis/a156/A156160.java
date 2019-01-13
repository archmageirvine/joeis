package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156160.
 * @author Sean A. Irvine
 */
public class A156160 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156160() {
    super(new long[] {1, -35, 35}, new long[] {169, 2809, 93025});
  }
}
