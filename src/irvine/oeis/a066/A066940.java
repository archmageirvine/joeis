package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A066940 Numbers n such that gcd(prime(n+1) + 1, prime(n) + 1) = 2.
 * @author Sean A. Irvine
 */
public class A066940 extends A000040 {

  private long mN = 0;
  private Z mP = super.next();
  private final Z mTarget;

  protected A066940(final Z target) {
    mTarget = target;
  }

  /** Construct the sequence. */
  public A066940() {
    this(Z.TWO);
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z q = mP;
      mP = super.next();
      if (q.add(1).gcd(mP.add(1)).equals(mTarget)) {
        return Z.valueOf(mN);
      }
    }
  }
}
