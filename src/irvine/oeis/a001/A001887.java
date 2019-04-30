package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001887 Number of permutations p of <code>{1,2,...,n}</code> such that <code>p(i) - i &lt; 0</code> or <code>p(i) - i &gt; 2</code> for all i.
 * @author Sean A. Irvine
 */
public class A001887 implements Sequence {

  private final Z[] mSeq = {
    Z.ONE,
    Z.ZERO,
    Z.ZERO,
    Z.ZERO,
    Z.ONE,
    Z.FIVE,
    Z.valueOf(33),
    Z.valueOf(236),
    Z.valueOf(1918),
  };
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN < mSeq.length) {
      return mSeq[mN];
    }
    final Z t = mSeq[8].multiply(mN - 1)
      .add(mSeq[7].multiply(mN + 2))
      .subtract(mSeq[6].multiply(3L * mN - 13))
      .subtract(mSeq[5].multiply(2L * mN - 8))
      .add(mSeq[4].multiply(3L * mN - 15))
      .add(mSeq[3].multiply(mN - 4))
      .subtract(mSeq[2].multiply(mN - 7))
      .subtract(mSeq[1]);
    System.arraycopy(mSeq, 1, mSeq, 0, 8);
    mSeq[8] = t;
    return t;
  }
}
