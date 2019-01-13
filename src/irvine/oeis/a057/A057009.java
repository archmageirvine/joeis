package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057009.
 * @author Sean A. Irvine
 */
public class A057009 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057009() {
    super(new long[] {36, -36, 11}, new long[] {1, 7, 41});
  }
}
