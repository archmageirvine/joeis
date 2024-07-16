package irvine.oeis.a071;

import irvine.oeis.RecordSequence;
import irvine.oeis.a004.A004018;

/**
 * A071385 Number of points (i,j) on the circumference of a circle around (0,0) with squared radius A071383(n).
 * @author Sean A. Irvine
 */
public class A071385 extends RecordSequence {

  /** Construct the sequence. */
  public A071385() {
    super(1, new A004018());
  }
}
