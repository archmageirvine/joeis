package irvine.oeis.a174;
// manually anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a055.A055631;
import irvine.oeis.a173.A173557;

/**
 * A174147 a(n) = n-th sum{p-1|p is prime and divisor of n} plus n-th product{p-1|p is prime and divisor of n}
 * @author Georg Fischer
 */
public class A174147 extends AbstractSequence {

  private int mN = 0;
  private A055631 mSeq1 = new A055631();
  private A173557 mSeq2 = new A173557();

  /** Construct the sequence. */
  public A174147() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = mSeq1.next().add(mSeq2.next());
    return (mN == 1) ? Z.ZERO : result;
  }
}
