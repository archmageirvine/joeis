package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057086.
 * @author Sean A. Irvine
 */
public class A057086 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057086() {
    super(new long[] {-10, 10}, new long[] {1, 10});
  }
}
