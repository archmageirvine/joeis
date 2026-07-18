package irvine.oeis.a085;

import java.util.HashSet;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A085920 Smallest palindromic multiple (not equal to the number itself) of the palindromes not included earlier.
 * @author Sean A. Irvine
 */
public class A085920 extends Sequence1 {

  private final Sequence mPalindromes = new A002113().skip();
  private final HashSet<Z> mUsed = new HashSet<>();

  @Override
  public Z next() {
    final Z p = mPalindromes.next();
    Z q = p;
    while (true) {
      q = q.add(p);
      if (Predicates.PALINDROME.is(q) && mUsed.add(q)) {
        return q;
      }
    }
  }
}
