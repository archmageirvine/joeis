package irvine.oeis.a321;
// manually andiv 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a002.A002829;

/**
 * A321426 Number of connected labeled fairly cubic graphs on 2n nodes.
 * @author Georg Fischer
 */
public class A321426 extends AbstractSequence {

  private A002829 mSeq1 = new A002829();
  private long mN;
  private Z mA0;
  private Z mA1;

  /** Construct the sequence. */
  public A321426() {
    super(0);
    mN = -1;
    mA0 = Z.ZERO;
    mA1 = Z.ZERO;
  }

  @Override
  public Z next() {
    // a(n) = 3*n*A002829(n) + 2*n*(2*n-1)*a(n-1) + n*(2*n-1)*(2*n-2)*(2*n-3)*a(n-2).
    ++mN;
    if (mN <= 1) {
      mSeq1.next();
      return Z.ZERO;
    }
    final long n2 = mN * 2;
    final Z result = mSeq1.next().multiply(3 * mN).add(mA1.multiply(n2).multiply(n2 - 1))
      .add(mA0.multiply(mN).multiply(n2 - 1).multiply(n2 - 2).multiply(n2 - 3));
    mA0 = mA1;
    mA1 = result;
    return result;
  }
}
