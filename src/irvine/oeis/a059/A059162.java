package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059162.
 * @author Sean A. Irvine
 */
public class A059162 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059162() {
    super(new long[] {-4, 4}, new long[] {12, 48});
  }
}
