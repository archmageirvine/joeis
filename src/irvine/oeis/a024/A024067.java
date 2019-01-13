package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024067.
 * @author Sean A. Irvine
 */
public class A024067 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024067() {
    super(new long[] {6, -37, 96, -135, 110, -51, 12}, new long[] {1, 5, 4, -27, 272, 4651, 38880});
  }
}
