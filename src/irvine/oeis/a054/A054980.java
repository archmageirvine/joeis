package irvine.oeis.a054;

import java.util.TreeSet;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * A054980 Primitive e-perfect numbers: primitive elements of the e-perfect numbers (A054979).
 * @author Sean A. Irvine
 */
public class A054980 extends A054979 {

  private final TreeSet<Z> mEPerfect = new TreeSet<>();

  @Override
  public Z next() {
    outer:
    while (true) {
      final Z t = super.next();
      mEPerfect.add(t);
      final FactorSequence fs = Cheetah.factor(t);
      for (final Z p : fs.toZArray()) {
        if (fs.getExponent(p) == 1 && mEPerfect.contains(t.divide(p))) {
          continue outer;
        }
      }
      return t;
    }
  }
}
