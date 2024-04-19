package irvine.oeis.a072;
// manually anopsn 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a217.A217863;

/**
 * A072211 a(n) = p-1 if n=p, p if n=p^e and e&lt;&gt;1, 1 otherwise; p a prime.
 * @author Georg Fischer
 */
public class A072211 extends AbstractSequence {

  private int mN = 0;
  private final A217863 mSeq1 = new A217863();
  private Z mA;

  /** Construct the sequence. */
  public A072211() {
    super(1);
    mA = mSeq1.next();
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final Z b = mSeq1.next();
    final Z result = b.divide(mA);
    mA = b;
    return result;
  }
}
