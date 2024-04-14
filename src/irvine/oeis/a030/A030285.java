package irvine.oeis.a030;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A030285 Palindromes whose digits do not appear in previous term.
 * @author Sean A. Irvine
 */
public class A030285 extends A002113 {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    final int syndrome = Functions.SYNDROME.i(mA);
    do {
      mA = super.next();
    } while ((Functions.SYNDROME.i(mA) & syndrome) != 0);
    return mA;
  }
}
