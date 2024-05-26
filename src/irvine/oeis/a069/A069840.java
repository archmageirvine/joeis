package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A069840 Number of different (unlabeled) 2-cell embeddings of the n-wheel graph W_(n+1) on n+1 nodes into orientable surfaces.
 * @author Sean A. Irvine
 */
public class A069840 extends AbstractSequence {

  /** Construct the sequence. */
  public A069840() {
    super(4);
  }

  private int mN = 3;

  @Override
  public Z next() {
    ++mN;
    final Z t = Integers.SINGLETON.sumdiv(mN, d -> Functions.PHI.z(d).square().multiply(Functions.FACTORIAL.z(mN / d - 1)).multiply(Z.valueOf(d).pow(mN / d - 1)).shiftLeft(mN / d)).divide(2L * mN);
    if ((mN & 1) == 0) {
      return t.add(Functions.FACTORIAL.z(mN / 2 - 1).shiftLeft(mN - 3));
    } else {
      return t;
    }
  }
}

