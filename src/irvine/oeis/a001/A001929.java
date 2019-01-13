package irvine.oeis.a001;

import irvine.math.z.Stirling;
import irvine.math.z.Z;

import java.util.ArrayList;

/**
 * A001929.
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
      s = s.add(mPosets.get(k).multiply(Stirling.secondKind(n, k)));
    }
    return s;
  }
}
