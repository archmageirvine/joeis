package irvine.oeis.a394;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a052.A052486;
import irvine.oeis.a286.A286708;

/**
 * A394561 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A394561 extends A286708 {

  private final DirectSequence mAchilles = DirectSequence.create(new A052486());

  @Override
  public Z next() {
    long cnt = 0;
    long k = 1;
    for (final Z d : Jaguar.factor(super.next()).divisorsSorted()) {
      while (mAchilles.a(k).compareTo(d) < 0) {
        ++k;
      }
      if (mAchilles.a(k).equals(d)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
