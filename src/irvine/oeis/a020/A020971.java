package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020971.
 * @author Sean A. Irvine
 */
public class A020971 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020971() {
    super(new long[] {693, -239, 27}, new long[] {1, 27, 490});
  }
}
