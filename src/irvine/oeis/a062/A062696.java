package irvine.oeis.a062;

import java.util.ArrayList;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A062696 Palindromes that are the sum of two shorter palindromes.
 * @author Sean A. Irvine
 */
public class A062696 extends A002113 {

  {
    super.next(); // skip 0
  }
  private final ArrayList<Z> mPalindromes = new ArrayList<>();

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.mod(10) == 1) { // All solutions must start and end with 1
        final int len = p.toString().length();
        for (final Z q : mPalindromes) {
          if (q.toString().length() == len) {
            break;
          }
          final Z r = p.subtract(q);
          if (Predicates.PALINDROME.is(10, r) && r.toString().length() < len) {
            mPalindromes.add(p);
            return p;
          }
        }
      }
      mPalindromes.add(p);
    }
  }
}
