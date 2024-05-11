package irvine.oeis.a053;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A053780 Palindromes arising in A053779.
 * @author Sean A. Irvine
 */
public class A053780 extends A002808 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mA = mA.add(super.next());
      if (Predicates.PALINDROME.is(mA)) {
        return mA;
      }
    }
  }
}
