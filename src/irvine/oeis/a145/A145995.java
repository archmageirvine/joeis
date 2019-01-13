package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145995.
 * @author Sean A. Irvine
 */
public class A145995 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145995() {
    super(new long[] {1, -3, 3}, new long[] {1, 4, 17});
  }
}
