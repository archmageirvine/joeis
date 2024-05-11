package irvine.oeis.a061;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061563 Start with n; add to itself with digits reversed; if palindrome, stop; otherwise repeat; a(n) gives palindrome at which it stops, or -1 if no palindrome is ever reached.
 * @author Sean A. Irvine
 */
public class A061563 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z t = mN;
    do {
      t = t.add(Functions.REVERSE.z(t));
    } while (!Predicates.PALINDROME.is(10, t));
    return t;
  }
}
