package irvine.oeis.a033;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A033865 Start with n; if palindrome, stop; otherwise add to itself with digits reversed; a(n) gives palindrome at which it stops, or -1 if no palindrome is ever reached.
 * @author Sean A. Irvine
 */
public class A033865 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    Z s = Z.valueOf(++mN);
    while (!Predicates.PALINDROME.is(s)) {
      s = s.add(Functions.REVERSE.z(s));
    }
    return s;
  }
}
