package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a006.A006567;

/**
 * A069204 Emirps congruent to their reversal mod 4.
 * @author Sean A. Irvine
 */
public class A069204 extends A006567 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.mod(4) == Functions.REVERSE.z(t).mod(4)) {
        return t;
      }
    }
  }
}

