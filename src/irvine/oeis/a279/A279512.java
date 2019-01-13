package irvine.oeis.a279;

import irvine.oeis.LinearRecurrence;

/**
 * A279512.
 * @author Sean A. Irvine
 */
public class A279512 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279512() {
    super(new long[] {12, -20, 9}, new long[] {6, 19, 85});
  }
}
