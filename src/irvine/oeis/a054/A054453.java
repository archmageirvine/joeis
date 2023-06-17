package irvine.oeis.a054;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;

/**
 * A054453 Triangle of partial row sums of triangle A054450(n,m), n &gt;= m &gt;= 0.
 * @author Sean A. Irvine
 */
public class A054453 extends AbstractSequence {

  /** Construct the sequence. */
  public A054453() {
    super(0);
  }

  private final Sequence mSeq = new A054450();
  private final ArrayList<Z> mA = new ArrayList<>();
  private int mN = 0;
  private int mM = 0;
  private Z mT = Z.ZERO;

  @Override
  public Z next() {
    if (++mM >= mA.size()) {
      mA.clear();
      ++mN;
      mT = Z.ZERO;
      for (int k = 0; k < mN; ++k) {
        final Z u = mSeq.next();
        mT = mT.add(u);
        mA.add(u);
      }
      mM = 0;
    }
    final Z res = mT;
    mT = mT.subtract(mA.get(mM));
    return res;
  }
}
