package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000290;

/**
 * A076816 Squares modulo triangular numbers: n^2 minus the greatest triangular number smaller than or equal to n^2.
 * @author Sean A. Irvine
 */
public class A076816 extends A000290 {

  private long mM = 0;

  @Override
  public Z next() {
    final Z s = super.next();
    if (s.isZero()) {
      return Z.ZERO;
    }
    while (Functions.TRIANGULAR.z(mM).compareTo(s) <= 0) {
      ++mM;
    }
    return s.mod(Functions.TRIANGULAR.z(mM - 1));
  }
}

