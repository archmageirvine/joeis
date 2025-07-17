package irvine.oeis.a384;

import java.util.List;

import irvine.math.z.Z;

/**
 * A384002 allocated for Michael De Vlieger.
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

