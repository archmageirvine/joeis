package irvine.oeis.a152;
// manually 2021-06-13

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A152684 a(n) is the number of top-down sequences (F_1, F_2, ..., F_n) whereas each F_i is a labeled forest on n nodes, containing i directed rooted trees. F_(i+1) is proper subset of F_i.
 * Formula: a(n) = n^(n-2)*(n!).
 * @author Georg Fischer
 */
public class A152684 implements Sequence {

  private Z mFact;
  private int mN;

  /** Construct the sequence */
  public A152684() {
    mFact = Z.ONE;
    mN = 1;
  }

  @Override
  public Z next() {
    final Z result = Z.valueOf(mN).pow(mN - 2).multiply(mFact);
    ++mN;
    mFact = mFact.multiply(mN);
    return result;
  }
}
