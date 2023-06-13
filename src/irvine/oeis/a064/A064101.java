package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A064101 Primes p = prime(k) such that prime(k) + prime(k+5) = prime(k+1) + prime(k+4) = prime(k+2) + prime(k+3).
 * @author Sean A. Irvine
 */
public class A064101 extends A000040 {

  private Z[] mA;

  protected A064101(final int n) {
    mA = new Z[n];
    for (int k = 0; k < n; ++k) {
      mA[k] = super.next();
    }
  }

  /** Construct the sequence. */
  public A064101() {
    this(5);
  }

  private boolean is(final Z t) {
    for (int k = 0, j = mA.length - 2; k <= j; ++k, --j) {
      if (!mA[k].add(mA[j]).equals(t)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = mA[0];
      System.arraycopy(mA, 1, mA, 0, mA.length - 1);
      mA[mA.length - 1] = super.next();
      if (is(p.add(mA[mA.length - 1]))) {
        return p;
      }
    }
  }
}
