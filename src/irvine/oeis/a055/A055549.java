package irvine.oeis.a055;

import java.util.ArrayList;
import java.util.List;

import irvine.math.LongUtils;

/**
 * A055549 Number of normal n X n (-1,0,1)-matrices.
 * @author Sean A. Irvine
 */
public class A055549 extends A055547 {

  @Override
  protected long limit(final int n) {
    return LongUtils.pow(3, n);
  }

  @Override
  protected List<Integer> toTuple(final long state, final int n) {
    final ArrayList<Integer> a = new ArrayList<>();
    long s = state;
    for (int k = 0; k < n; ++k) {
      a.add((int) (s % 3) - 1);
      s /= 3;
    }
    return a;
  }
}
