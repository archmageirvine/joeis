package irvine.oeis.a090;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A090508 Least number beginning with prime(n) such that every concatenation is a prime.
 * @author Sean A. Irvine
 */
public class A090508 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 1;
  protected String mConc = "";

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    final String p = String.valueOf(mP);
    mConc += p;
    String c = "";
    long cc = 0;
    while (true) {
      final String s = mConc + c;
      if (new Z(s).isProbablePrime()) {
        mConc = s;
        return new Z(p + c);
      }
      c = String.valueOf(++cc);
    }
  }
}
