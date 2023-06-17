package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000720 pi(n), the number of primes &lt;= n. Sometimes called PrimePi(n) to distinguish it from the number 3.14159...
 * @author Sean A. Irvine
 */
public class A000720 extends AbstractSequence {

  /** Construct the sequence. */
  public A000720() {
    super(1);
  }

  protected Z mN = Z.ZERO;
  private Z mP = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.isPrime()) {
      mP = mP.add(1);
    }
    return mP;
  }
}
