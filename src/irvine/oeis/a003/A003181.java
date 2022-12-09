package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.DifferenceSequence;
import irvine.oeis.Sequence0;

/**
 * A003181 Number of P-equivalence classes of nondegenerate Boolean functions of n variables.
 * @author Georg Fischer
 */
public class A003181 extends Sequence0 {

  private int mN = -1;
  private final DifferenceSequence mSeq = new DifferenceSequence(new A003180());

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.TWO : mSeq.next();
  }
}
