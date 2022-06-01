package irvine.oeis.a280;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A280072 Indices of centered 11-gonal numbers (A060544) that are also 11-gonal numbers (A051682).
 * @author Sean A. Irvine
 */
public class A280072 extends LinearRecurrence {

  /** Construct the sequence. */
  public A280072() {
    super(new long[] {1, -21, 21}, new long[] {1, 11, 210});
  }
}
