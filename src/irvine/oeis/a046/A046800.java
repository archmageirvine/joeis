package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000225;

/**
 * A046800 Number of distinct prime factors of 2^n-1.
 * @author Sean A. Irvine
 */
public class A046800 extends A000225 {

  @Override
  public Z next() {
    final Z a = super.next();
    return a.compareTo(Z.TWO) < 0 ? Z.ZERO : Z.valueOf(Functions.OMEGA.i(a));
  }
}

