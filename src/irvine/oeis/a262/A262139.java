package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262139.
 * @author Sean A. Irvine
 */
public class A262139 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262139() {
    super(new long[] {1, -7, 7}, new long[] {22, 145, 862});
  }
}
