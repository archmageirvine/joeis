package irvine.oeis.a000;

import java.util.ArrayList;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a001.A001035;

/**
 * A000798 Number of different quasi-orders (or topologies, or transitive digraphs) with n labeled elements.
 * @author Sean A. Irvine
 */
public class A000798 extends A001035 {

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
