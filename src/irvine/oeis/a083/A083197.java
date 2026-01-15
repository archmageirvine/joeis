package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;
import irvine.oeis.a002.A002808;

/**
 * A083197 Triangular array, read by rows, where if n is odd the n-th row consists of n least unused nonprimes, while if n is even the n-th row consists of the n least unused primes.
 * @author Sean A. Irvine
 */
public class A083197 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private final Sequence mP = new A000040();
  private final Sequence mC = new A002808();

  @Override
  public Z next() {
    if (++mM >= mN) {
      if (++mN == 1) {
        return Z.ONE;
      }
      mM = 0;
    }
    return (mN & 1) == 0 ? mP.next() : mC.next();
  }
}

