package irvine.oeis.a319;

import irvine.math.z.Z;

/**
 * A319519 Number of sets of nonempty words with a total of 2n letters over n-ary alphabet such that all n letters occur at least once in the set.
 * @author Georg Fischer
 */
public class A319519 extends A319501 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return super.compute(2 * mN, mN);
  }
}
