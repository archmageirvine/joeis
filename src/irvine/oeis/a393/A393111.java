package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A393111 Distance from 2^n to the nearest base-10 palindrome.
 * @author Sean A. Irvine
 */
public class A393111 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply2();
    if (Predicates.PALINDROME.is(mA)) {
      return Z.ZERO;
    }
    final Z prev = Functions.PREV_PALINDROME.z(mA);
    final Z next = Functions.NEXT_PALINDROME.z(mA);
    return next.subtract(mA).min(mA.subtract(prev));
  }
}
