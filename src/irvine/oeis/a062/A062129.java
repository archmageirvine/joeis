package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062129 In base 2: start with n; add to itself with digits reversed; if palindrome, stop; otherwise repeat; a(n) gives palindrome at which it stops, or -1 if no palindrome is ever reached.
 * otherwise repeat; a(n) gives palindrome at which it stops, or -1 if no palindrome is ever reached.
 * Limit = 1024.
 * @author Georg Fischer
 */
public class A062129 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    Z s = Z.valueOf(++mN);
    int loopCheck = 1024;
    boolean busy = true;
    while (--loopCheck >= 0 && busy) {
      s = s.add(Functions.REVERSE.z(2, s));
      busy = !Predicates.PALINDROME.is(2, s);
    }
    if (loopCheck < 0) {
      return Z.NEG_ONE;
    }
    return new Z(s.toString(2));
  }
}
