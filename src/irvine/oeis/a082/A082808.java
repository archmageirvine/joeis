package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.a002.A002385;
import irvine.util.Permutation;

/**
 * A082808 Palindromic primes whose digit permutation yields at least one other palindromic prime.
 * @author Sean A. Irvine
 */
public class A082808 extends A002385 {

  private boolean isPalindrome(final int[] p) {
    int start = 0;
    while (start < p.length && p[start] == 0) {
      ++start;
    }
    for (int k = start, j = p.length - 1; k < j; ++k, --j) {
      if (p[k] != p[j]) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z palin = super.next();
      final Permutation perm = Permutation.permuter(palin);
      int[] p;
      while ((p = perm.next()) != null) {
        if (isPalindrome(p)) {
          final Z v = Permutation.permToZ(p);
          if (!v.equals(palin) && v.isProbablePrime()) {
            return palin;
          }
        }
      }
    }
  }
}
