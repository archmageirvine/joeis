package irvine.oeis.a007;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007818 Maximal number of bonds joining n nodes in simple cubic lattice.
 * @author Sean A. Irvine
 */
public class A007818 implements Sequence {

  // After Martin Y. Veillette

  private int mN = -1;
  private List<Z> mQ = Collections.emptyList();

  private List<Z> plusFoldList(final int[] lst) {
    final ArrayList<Z> res = new ArrayList<>(lst.length + 1);
    res.add(Z.ZERO);
    Z s = Z.ZERO;
    for (final int n : lst) {
      s = s.add(n);
      res.add(s);
    }
    return res;
  }

  private void dec(final int[] q, final int pos) {
    if (pos <= q.length) {
      --q[pos - 1];
    }
  }

  private void reduceJ(final int[] q, final int j) {
    for (int i = 1; i <= j; ++i) {
      dec(q, j * j * j + i * (i - 1));
      dec(q, j * j * j + i * i);
      dec(q, j * j * (j + 1) + i * (i + 1));
      dec(q, j * j * (j + 1) + i * i);
      dec(q, j * (j + 1) * (j + 1) + i * (i + 1));
      dec(q, j * (j + 1) * (j + 1) + i * i);
    }
  }

  private void reduce1(final int[] q) {
    for (int j = 0; j <= Math.pow(q.length, 1.0 / 3.0) + 1; ++j) {
      reduceJ(q, j);
    }
  }

  private void reduce2(final int[] q) {
    for (int j = 1; j <= Math.pow(q.length, 1.0 / 3.0) + 1; ++j) {
      dec(q, j * j * j);
      dec(q, j * j * (j + 1));
      dec(q, (j + 1) * (j + 1) * j);
    }
  }

  @Override
  public Z next() {
    if (++mN >= mQ.size()) {
      final int[] q = new int[2 * mQ.size() + 1];
      Arrays.fill(q, 3);
      reduce1(q);
      reduce2(q);
      mQ = plusFoldList(q);
    }
    return mQ.get(mN);
  }
}
