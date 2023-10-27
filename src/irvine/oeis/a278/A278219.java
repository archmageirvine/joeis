package irvine.oeis.a278;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.a005.A005940;


/**
 * A278219 Filter-sequence related to base-2 run-length encoding: a(n) = A046523(A243353(n)).
 * @author Georg Fischer
 */
public class A278219 extends AbstractSequence implements DirectSequence {

  private final A005940 mSeq = new A005940();
  private int mN;

  /** Construct the sequence. */
  public A278219() {
    super(0);
    mN = -1;
  }

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final int n) {
    final int m = n ^ (n / 2);
    return FactorUtils.leastPrimeSignature(mSeq.a(m + 1)); // from A278222
  }

  @Override
  public Z a(final Z n) {
    final Z m = n.xor(n.divide2());
    return FactorUtils.leastPrimeSignature(mSeq.a(m.add(1)));
  }

}
