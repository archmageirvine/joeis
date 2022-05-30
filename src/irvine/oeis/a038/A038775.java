package irvine.oeis.a038;

import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * A038775 a(n) is the number of cycles of the permutation that converts forest(n) of depth-first planar planted binary trees into breadth-first representation.
 * @author Sean A. Irvine
 */
public class A038775 extends A038774 {

  private long mN = 0;
  private Z mSum = Z.ZERO;
  private long mM = 0;

  @Override
  public Z next() {
    final Z target = Binomial.catalan(++mN);
    do {
      mSum = mSum.add(super.next());
      ++mM;
    } while (!mSum.equals(target));
    return Z.valueOf(mM);
  }
}
