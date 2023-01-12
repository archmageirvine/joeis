package irvine.oeis.a345;
// manually andiv 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a167.A167760;

/**
 * A345655 a(n) is the number of permutations w of [n] with no w(i)+1 == w(i+1) (mod n) that are not simply cyclic permutations of the numbers 1 to n in backwards order.
 * @author Georg Fischer
 */
public class A345655 extends AbstractSequence {

  private A167760 mSeq1 = new A167760();
  private long mN;

  /** Construct the sequence. */
  public A345655() {
    super(1);
    mN = 0;
    mSeq1.next();
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = mSeq1.next().subtract(mN);
    return (mN <= 2) ? Z.ZERO : result;
  }
}
