package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059140.
 * @author Sean A. Irvine
 */
public class A059140 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059140() {
    super(new long[] {2, -5, 4}, new long[] {4, 15, 40});
  }
}

