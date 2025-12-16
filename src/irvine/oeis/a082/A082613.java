package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a002.A002113;

/**
 * A082613 Smallest palindrome divisible by an n-th power.
 * @author Sean A. Irvine
 */
public class A082613 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Sequence palindromes = new A002113().skip();
    while (true) {
      final Z p = palindromes.next();
      long k = 1;
      while (true) {
        final Z v = Z.valueOf(++k).pow(mN);
        if (v.compareTo(p) > 0) {
          break;
        }
        if (p.mod(v).isZero()) {
          return p;
        }
      }
    }
  }
}
