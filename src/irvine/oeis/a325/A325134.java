package irvine.oeis.a325;
// manually anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001222;
import irvine.oeis.a061.A061395;

/**
 * A325134 a(1) = 1; a(n) = number of prime factors of n counted with multiplicity plus the largest prime index of n.
 * @author Georg Fischer
 */
public class A325134 extends AbstractSequence {

  private int mN = 0;
  private A001222 mSeq1 = new A001222();
  private A061395 mSeq2 = new A061395();

  /** Construct the sequence. */
  public A325134() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = mSeq1.next().add(mSeq2.next());
    return (mN == 1) ? Z.ONE : result;
  }
}
