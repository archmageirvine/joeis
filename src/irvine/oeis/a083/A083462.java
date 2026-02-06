package irvine.oeis.a083;

import java.util.HashSet;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A083462 Smallest palindrome k such that k - n is a distinct power of 2; i.e., a power of 2 that has not arisen earlier; or 0 if no such k exists.
 * @author Sean A. Irvine
 */
public class A083462 extends Sequence0 {

  private final HashSet<Z> mUsed = new HashSet<>();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z k = Z.ONE;
    while (true) {
      final Z t = k.add(mN);
      if (Predicates.PALINDROME.is(t) && mUsed.add(k)) {
        return t;
      }
      k = k.multiply2();
    }
  }
}
