package irvine.oeis.a074;

import irvine.oeis.RecordSequence;

/**
 * A074097 Record values in A074078.
 * @author Sean A. Irvine
 */
public class A074097 extends RecordSequence {

  /** Construct the sequence. */
  public A074097() {
    super(1, new A074078().skip());
  }
}
