package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062130 A062128 written in base 10.
 * Limit = 1024.
 * @author Georg Fischer
 */
public class A062130 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    Z s = Z.valueOf(++mN);
    int loopCheck = 1024;
    while (--loopCheck >= 0 && !Predicates.PALINDROME.is(2, s)) {
      s = s.add(Functions.REVERSE.z(2, s));
    }
    if (loopCheck < 0) {
      return Z.NEG_ONE;
    }
    return s;
  }
}
