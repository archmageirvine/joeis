package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a004.A004151;

/**
 * A083960 Smallest palindromic multiple of (n with trailing 0's omitted, A004151) using only nonzero digits of n; all digits must appear; or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A083960 extends Sequence1 {

  private final Sequence mS = new A004151();

  @Override
  public Z next() {
    final Z n = mS.next();
    final int syn = Functions.SYNDROME.i(n) & ~1;
    Z t = n;
    while (!Predicates.PALINDROME.is(t) || Functions.SYNDROME.i(t) != syn) {
      t = t.add(n);
    }
    return t;
  }
}
