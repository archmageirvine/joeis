package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a002.A002385;

/**
 * A030463 Previous palindromic prime concatenated with this palindromic prime is prime.
 * @author Sean A. Irvine
 */
public class A030463 extends Sequence0 {

  private final Sequence mPalinPrime = new A002385();
  private Z mP = mPalinPrime.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mP;
      mP = mPalinPrime.next();
      if (new Z(t.toString() + mP).isProbablePrime()) {
        return mP;
      }
    }
  }
}
