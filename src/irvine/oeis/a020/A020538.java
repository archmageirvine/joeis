package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020538.
 * @author Sean A. Irvine
 */
public class A020538 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020538() {
    super(new long[] {64, -84, 21}, new long[] {1, 97, 1921});
  }
}
