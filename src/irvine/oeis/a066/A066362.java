package irvine.oeis.a066;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066362 a(n) = least k &gt; n such that phi(k) &lt; phi(n), if such a k exists; otherwise a(n) = 0.
 * @author Sean A. Irvine
 */
public class A066362 extends Sequence1 {

  private final List<TreeSet<Z>> mSmaller = new ArrayList<>();
  {
    mSmaller.add(new TreeSet<>()); // 0
  }
  private long mN = 0;

  @Override
  public Z next() {
    final long n1 = ++mN;
    final Z phi = Functions.PHI.z(n1);
    final int iphi = phi.intValueExact();
    while (iphi >= mSmaller.size()) {
      mSmaller.add(InverseEuler.inversePhi(Z.valueOf(mSmaller.size())));
    }
    int k = iphi;
    Z min = null;
    final Z n = Z.valueOf(mN);
    while (k > 1) {
      --k;
      final TreeSet<Z> s = mSmaller.get(k);
      while (!s.isEmpty() && s.first().compareTo(n) < 0) {
        s.pollFirst();
      }
      if (!s.isEmpty() && (min == null || s.first().compareTo(min) < 0)) {
        min = s.first();
      }
    }
    return min == null ? Z.ZERO : min;
  }
}
