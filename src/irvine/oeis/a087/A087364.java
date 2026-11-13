package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a056.A056525;

/**
 * A087364 Smallest palindromic prime built using the palindromes with odd number of digits as central digits.
 * @author Sean A. Irvine
 */
public class A087364 extends Sequence1 {

  private final Sequence mPalins = new A056525();

  @Override
  public Z next() {
    Z palindrome = mPalins.next();
    // Sequence requires adding at least one digit
    Z mul = Z.TEN.pow(Functions.DIGIT_LENGTH.l(palindrome));
    long lim = 1;
    long k = 0;
    while (true) {
      if (++k == lim) {
        lim *= 10;
        mul = mul.multiply(10);
        palindrome = palindrome.multiply(10);
      }
      final long r = Functions.REVERSE.l(k);
      if ((r & 1) == 1) {
        final Z t = mul.multiply(k).add(palindrome).add(r);
        if (t.isProbablePrime()) {
          return t;
        }
      }
    }
  }
}
