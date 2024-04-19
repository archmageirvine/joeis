package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a018.A018252;

/**
 * A073846 a(1) = 1; thereafter, every even-indexed term is prime and every odd-indexed term is composite.
 * @author Georg Fischer
 */
public class A073846 extends A018252 {

  private int mN = 0;
  private final Sequence mPrime = new A000040();

  @Override
  public Z next() {
    ++mN;
    return ((mN & 1) == 1) ? super.next() : mPrime.next();
  }
}
