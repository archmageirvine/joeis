package irvine.oeis.a055;

import java.util.ArrayList;
import java.util.List;

/**
 * A055548 Number of normal n X n (-1,1)-matrices.
 * @author Sean A. Irvine
 */
public class A055548 extends A055547 {

  @Override
  protected List<Integer> toTuple(final long state, final int n) {
    final ArrayList<Integer> a = new ArrayList<>();
    long s = state;
    for (int k = 0; k < n; ++k) {
      a.add(2 * (int) (s & 1) - 1);
      s >>>= 1;
    }
    return a;
  }
}
