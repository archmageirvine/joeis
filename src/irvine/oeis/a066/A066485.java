package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a001.A001223;

/**
 * A066485 Numbers n such that f(n) is a strict local extremum for the prime gaps function f(n) = prime(n+1)-prime(n), where prime(n) denotes the n-th prime; i.e., either f(n)&gt;f(n-1) and f(n)&gt;f(n+1) or f(n)&lt;f(n-1) and f(n)&lt;f(n+1).
 * @author Sean A. Irvine
 */
public class A066485 extends A001223 {

  private Z mA = super.next();
  private Z mB = super.next();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA;
      mA = mB;
      mB = super.next();
      final int left = mA.compareTo(t);
      final int right = mA.compareTo(mB);
      if (left == right && left != 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

