package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017817.
 * @author Sean A. Irvine
 */
public class A017817 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017817() {
    super(new long[] {1, 1, 0, 0}, new long[] {1, 0, 0, 1});
  }
}
