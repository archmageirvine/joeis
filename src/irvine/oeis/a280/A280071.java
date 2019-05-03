package irvine.oeis.a280;

import irvine.oeis.LinearRecurrence;

/**
 * A280071 Indices of 11-gonal numbers <code>(A051682)</code> that are also centered 11-gonal numbers <code>(A060544)</code>.
 * @author Sean A. Irvine
 */
public class A280071 extends LinearRecurrence {

  /** Construct the sequence. */
  public A280071() {
    super(new long[] {1, -21, 21}, new long[] {1, 12, 232});
  }
}
