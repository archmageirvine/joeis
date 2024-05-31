package irvine.oeis.a001;

import java.util.ArrayList;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A001929 Number of connected topologies on n labeled points.
 * @author Sean A. Irvine
 */
public class A001929 extends A001927 {

  private final ArrayList<Z> mPosets = new ArrayList<>();

  @Override
  public Z next() {
    final int n = mPosets.size();
    mPosets.add(super.next());
    Z s = Z.ZERO;
    for (int k = 0; k <= n; ++k) {
      s = s.add(mPosets.get(k).multiply(Functions.STIRLING2.z(n, k)));
    }
    return s;
  }
}
