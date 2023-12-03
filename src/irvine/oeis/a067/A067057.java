package irvine.oeis.a067;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067057 Let A(n) = {1,2,3,...n}. Let B(r) and C(n-r) be two subsets of A(n) having r and n-r elements respectively, such that B(r) U C(n-r) = A(n) and B and C are disjoint; then a(n) = sum of the products of all combination sums of elements of B and C for r =1 to n-1.
 * @author Sean A. Irvine
 */
public class A067057 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Stirling.firstKind(++mN + 1, mN - 1).shiftLeft(mN - 2);
  }
}

