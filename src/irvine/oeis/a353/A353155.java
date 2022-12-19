package irvine.oeis.a353;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;
import irvine.oeis.transform.LogarithmicTransformSequence;

/**
 * A353155 Logarithmic transform of odd primes.
 * @author Georg Fischer
 */
public class A353155 extends Sequence1 {

  private final LogarithmicTransformSequence mSeq1 = new LogarithmicTransformSequence(new A000040(), 1);

  @Override
  public Z next() {
    return mSeq1.next();
  }
}
