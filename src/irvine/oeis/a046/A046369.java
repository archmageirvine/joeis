package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a033.A033620;

/**
 * A046369 Numbers with exactly 3 palindromic prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046369 extends A033620 {

  protected int targetOmega() {
    return 3;
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (Jaguar.factor(t).bigOmega() == targetOmega()) {
        return t;
      }
    }
  }
}
