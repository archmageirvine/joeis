package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a018.A018252;

/**
 * A024678 a(n) is the position of (prime(n+1) + prime(n+2))/2 in the ordered nonprimes.
 * @author Sean A. Irvine
 */
public class A024678 extends A024675 {

  private final Sequence mNonprimes = new A018252();
  private long mN = 0;

  @Override
  public Z next() {
    final Z t = super.next();
    do {
      ++mN;
    } while (!t.equals(mNonprimes.next()));
    return Z.valueOf(mN);
  }
}
