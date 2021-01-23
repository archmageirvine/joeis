package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023996 Triangle of numbers T(n,k), where T(n,k) is the number of sets S = {a_1, a_2, ..., a_k}, with 1 &lt; a_i &lt; a_j &lt;= n such that no a_j divides the product of all the others.
 * @author Sean A. Irvine
 */
public class A023996 implements Sequence {

  private int mN = 0;
  private int mM = -1;
  private long[] mCount = {0};

  private boolean check(final Z product, final int[] set, final int pos) {
    for (int k = 0; k < pos; ++k) {
      if (product.divide(set[k]).mod(set[k]) == 0) {
        return false;
      }
    }
    return true;
  }

  private void search(final int[] set, final Z product, final int pos) {
    ++mCount[pos];
    for (int k = pos == 0 ? 2 : set[pos - 1]; k <= mN; ++k) {
      if (product.mod(k) != 0) {
        final Z newProduct = product.multiply(k);
        if (check(newProduct, set, pos)) {
          set[pos] = k;
          search(set, newProduct, pos + 1);
        }
      }
    }
  }

  @Override
  public Z next() {
    if (mCount[++mM] == 0) {
      mM = 0;
      mCount = new long[++mN + 1];
      search(new int[mN], Z.ONE, 0);
    }
    return Z.valueOf(mCount[mM]);
  }
}

