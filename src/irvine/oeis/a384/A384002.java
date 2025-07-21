package irvine.oeis.a384;

import java.util.List;

import irvine.math.z.Z;

/**
 * A384002 Let S(n,j,k), j = 1..n, k = 1..A024718(n), where row 1 = {(0),(1)}, and row n = union of n-tuples whose sum m &lt; n, and the n-tuples formed by appending m to the (n-1)-tuples in row n-1. Then T(n,j) = j-th tuple in row n of S read as a base n+1 number expressed in decimal.
 * @author Sean A. Irvine
 */
public class A384002 extends A384001 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN >= mRow.size()) {
      step();
      mN = 0;
    }
    Z res = Z.ZERO;
    final List<Integer> tuple = mRow.get(mN);
    final long b = tuple.size() + 1;
    for (final int v : tuple) {
      res = res.multiply(b).add(v);
    }
    return res;
  }
}

