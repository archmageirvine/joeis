package irvine.oeis.a052;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a050.A050412;

/**
 * A052339 Values of n at which record values in A052340 are reached.
 * @author Sean A. Irvine
 */
public class A052339 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A052339() {
    super(new A050412(), 1);
  }
}
