package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000108;
import irvine.oeis.transform.Stirling1TransformSequence;

/**
 * A086672 Stirling1 transform of Catalan numbers: Sum_{k=0..n} Stirling1(n,k)*binomial(2*k,k)/(k+1).
 * @author Georg Fischer
 */
public class A086672 extends Sequence0 {

  private int mN = -1;
  private final Sequence mSeq1 = new Stirling1TransformSequence(new A000108(), 0);

  @Override
  public Z next() {
    ++mN;
    final Z result = mSeq1.next();
    return (mN == 0) ? Z.ONE : result;
  }
}
