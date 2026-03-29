package irvine.oeis.a392;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a286.A286708;

/**
 * A000959 Lucky numbers.
 * @author Sean A. Irvine
 */
public class A392265 extends A286708 {

  private final HashSet<Z> mA = new HashSet<>();

  @Override
  public Z next() {
    final Z t = super.next();
    mA.add(t);
    long cnt = 0;
    for (final Z d : Jaguar.factor(t).divisors()) {
      if (mA.contains(d)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
