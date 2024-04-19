package irvine.oeis.a343;
// manually anopsn 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a023.A023645;

/**
 * A343005 a(n) is the number of dihedral symmetries D_{2m} (m &gt;= 3) that configurations of n non-overlapping equal circles can possess.
 * @author Georg Fischer
 */
public class A343005 extends AbstractSequence {

  private int mN = 1;
  private final A023645 mSeq1 = new A023645();
  private Z mA;

  /** Construct the sequence. */
  public A343005() {
    super(2);
    mSeq1.next();
    mA = mSeq1.next();
  }

  @Override
  public Z next() {
    if (++mN == 2) {
      return Z.ZERO;
    }
    final Z b = mSeq1.next();
    final Z result = b.add(mA);
    mA = b;
    return result;
  }
}
