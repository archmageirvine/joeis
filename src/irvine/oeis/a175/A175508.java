package irvine.oeis.a175;
// manually anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a003.A003963;

/**
 * A175508 If p is the product of k1-th prime, k2-th prime,..,kr-th prime then set a(n)=n-k1*k2*..*kr, if p is the k-th prime then set=n-k, a(1)=1 by convention.
 * @author Georg Fischer
 */
public class A175508 extends AbstractSequence {

  private int mN = 0;
  private A003963 mSeq2 = new A003963();

  /** Construct the sequence. */
  public A175508() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = Z.valueOf(mN).subtract(mSeq2.next());
    return (mN == 1) ? Z.ONE : result;
  }
}
