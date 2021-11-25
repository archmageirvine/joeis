package irvine.oeis.a052;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.a002.A002385;
import irvine.util.Permutation;

/**
 * A052507 Take n-th palindromic prime p, let P = all primes having same digits; a(n) = q-p where q is smallest prime in P &gt;p if q exists; otherwise a(n) = p-r where r is largest prime in P &lt;p if r exists; otherwise a(n) = 0.
 * @author Sean A. Irvine
 */
public class A052507 extends A002385 {

  private final ArrayList<Z> mA = new ArrayList<>();
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mA.size()) {
      mA.clear();
      mM = 0;
      final Z palin = super.next();
      final Permutation perm = A052495.permuter(palin);
      int[] p;
      while ((p = perm.next()) != null) {
        if (p[0] != 0) {
          final Z t = A052495.permToZ(p);
          if (t.isProbablePrime()) {
            mA.add(A052495.compute(t));
          }
        }
      }
    }
    return mA.get(mM);
  }
}
