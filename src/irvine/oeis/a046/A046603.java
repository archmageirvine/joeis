package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046603 First numerator and then denominator of each element of the 1/5-Pascal triangle (by row), excluding 1's.
 * @author Sean A. Irvine
 */
public class A046603 extends A046601 {

  @Override
  public Z next() {
    while (true) {
      final Z a = super.next();
      if (!Z.ONE.equals(a)) {
        return a;
      }
    }
  }
}
