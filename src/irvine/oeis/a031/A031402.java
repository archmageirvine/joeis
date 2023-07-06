package irvine.oeis.a031;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a010.A010340;

/**
 * A031402 Sum of terms in period of continued fraction for sqrt(a(n)) increases.
 * @author Sean A. Irvine
 */
public class A031402 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A031402() {
    super(1, new A010340().skip(1), 2);
  }
}
