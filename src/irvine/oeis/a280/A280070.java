package irvine.oeis.a280;

import irvine.oeis.LinearRecurrence;

/**
 * A280070 Indices of 10-gonal numbers (A001107) that are also centered 10-gonal numbers (A062786).
 * @author Sean A. Irvine
 */
public class A280070 extends LinearRecurrence {

  /** Construct the sequence. */
  public A280070() {
    super(new long[] {1, -19, 19}, new long[] {1, 11, 191});
  }
}
