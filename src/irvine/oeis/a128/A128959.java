package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128959.
 * @author Sean A. Irvine
 */
public class A128959 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128959() {
    super(new long[] {-10, 11, -11, 11, -11, 11}, new long[] {82, 810, 8096, 80953, 809524, 8095239});
  }
}
