package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084998 Palindromes formed from the concatenation of n, sum of n and R(n), and R(n) with its leading zeros; or 0 if no such palindrome exists. R(k) is the digit reversal of k.
 * @author Sean A. Irvine
 */
public class A084998 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    final long t =  mN + Functions.REVERSE.l(mN);
    final StringBuilder u = new StringBuilder(s).reverse();
    final Z v = new Z(s + t + u);
    return Predicates.PALINDROME.is(v) ? v : Z.ZERO;
  }
}
