package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.LengthPalindromes;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A083145 Smallest nontrivial palindromic multiple of the n-th palindrome (a(n) is not equal to the n-th palindrome).
 * @author Sean A. Irvine
 */
public class A083145 extends Sequence1 {

  private final Sequence mS = new A002113().skip();

  @Override
  public Z next() {
    final Z m = mS.next();
    int len = Functions.DIGIT_LENGTH.i(m);
    while (true) {
      final Sequence palins = new LengthPalindromes(len);
      while (true) {
        final Z p = palins.next();
        if (p == null) {
          break;
        }
        if (p.compareTo(m) <= 0) {
          continue;
        }
        if (p.mod(m).isZero()) {
          return p;
        }
      }
      ++len;
    }
  }
}

