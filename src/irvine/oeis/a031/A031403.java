package irvine.oeis.a031;

import irvine.oeis.RecordSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a010.A010340;

/**
 * A031403 Sum of terms in period of continued fraction for sqrt(A031402(n)).
 * @author Sean A. Irvine
 */
public class A031403 extends RecordSequence {

  /** Construct the sequence. */
  public A031403() {
    super(new SkipSequence(new A010340(), 1));
  }
}
