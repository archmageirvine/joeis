package irvine.oeis.a256;
// manually 2026-09-23/filnum at 2026-09-23 21: 43

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.q.Q;
import irvine.math.z.ZUtils;
import irvine.oeis.FilterNumberSequence;

/**
 * A256075 Non-palindromic balanced numbers (in base 10).
 * @author Georg Fischer
 */
public class A256075 extends FilterNumberSequence {

  /* Maple:
     filter:= proc(n) local L, m;
       L:= convert(n, base, 10);
       m:= (1+nops(L))/2;
       add(L[i]*(i-m), i=1..nops(L))=0 and L <> ListTools:-Reverse(L)
     end proc:
  */

  /**
   * Test if the number is balanced in a given base.
   * @param base the base
   * @param n number
   * @return is balanced
   */
  public static boolean balancedIs(final int base, final long n) {
    final int len = Functions.DIGIT_LENGTH.i(base, n);
    final Q m = new Q(len + 1, 2);
    return ZUtils.iterate(n, base, Q.ZERO, (x, d, e) -> x.add(Q.valueOf(e + 1).subtract(m).multiply(d))).isZero();
  }

  /** Construct the sequence. */
  public A256075() {
    this(1, 10);
  }

  /**
   * Generic constructor with parameter.
   * @param offset first index
   * @param base number base
   */
  public A256075(final int offset, final int base) {
    super(1, 0, k -> balancedIs(base, k) && !Predicates.PALINDROME.is(base, k));
  }

}
