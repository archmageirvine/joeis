package irvine.oeis.a075;

import irvine.oeis.LinearRecurrence;

/**
 * A075869 5*n^2 - 9 is a square.
 * @author Sean A. Irvine
 */
public class A075869 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075869() {
    super(new long[] {-1, 18}, new long[] {3, 51});
  }
}
