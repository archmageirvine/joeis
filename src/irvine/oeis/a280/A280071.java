package irvine.oeis.a280;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A280071 Indices of 11-gonal numbers (A051682) that are also centered 11-gonal numbers (A060544).
 * @author Sean A. Irvine
 */
public class A280071 extends LinearRecurrence {

  /** Construct the sequence. */
  public A280071() {
    super(1, new long[] {1, -21, 21}, new long[] {1, 12, 232});
  }
}
