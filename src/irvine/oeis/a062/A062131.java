package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062131 A062129 written in base 10.
 * Limit = 1024
 * @author Georg Fischer
 */
public class A062131 extends Sequence0 {

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
    return s;
  }
}
