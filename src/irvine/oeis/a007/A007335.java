package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a003.A003586;

/**
 * A007335.
 * @author Sean A. Irvine
 */
public class A007335 extends A003586 {

  @Override
  public Z next() {
    while (true) {
      final Z a = super.next();
      Z t = a.makeOdd();
      final long twos = a.auxiliary();
      if (twos == 1) {
        return a;
      }
      int threes = 0;
      while (!Z.ONE.equals(t)) {
        t = t.divide(3);
        ++threes;
      }
      if (threes == 1) {
        return a;
      }
      if ((twos & 1) == 1 && (threes & 1) == 1) {
        return a;
      }
    }
  }
}
