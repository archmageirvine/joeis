package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020979.
 * @author Sean A. Irvine
 */
public class A020979 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020979() {
    super(new long[] {880, -278, 29}, new long[] {1, 29, 563});
  }
}
