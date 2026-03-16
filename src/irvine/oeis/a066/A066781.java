package irvine.oeis.a066;
// manually 2026-03-16

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A066781 a(n) = 2^phi(n).
 * @author Georg Fischer
 */
public class A066781 extends Sequence1 implements DirectSequence {

  private long mN = 0;

  @Override
  public Z next() {
    return a(++mN);
  }


  @Override
  public Z a(final Z n) {
    return Z.TWO.pow(Functions.PHI.z(n));
  }

  @Override
  public Z a(final long n) {
    return Z.TWO.pow(Functions.PHI.z(n));
  }

}
