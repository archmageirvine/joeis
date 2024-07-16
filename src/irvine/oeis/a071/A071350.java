package irvine.oeis.a071;

import irvine.oeis.RecordSequence;
import irvine.oeis.a058.A058250;

/**
 * A071350 Distinct values of A058250; these terms appear first at subscripts listed in A071349.
 * @author Sean A. Irvine
 */
public class A071350 extends RecordSequence {

  /** Construct the sequence. */
  public A071350() {
    super(1, new A058250().skip());
  }
}
