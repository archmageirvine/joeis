package irvine.oeis.a065;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A065802 How small is the squeezed n-gon? Let s0 be the side of a regular n-gon and s1 the side of the maximal n-gon which can be squeezed between the former and its circumcircle. The n-th entry in the sequence is floor(s0/s1).
 * @author Sean A. Irvine
 */
public class A065802 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    if ((++mN & 1) == 1) {
      final CR c = CR.PI.divide(mN).cos();
      return CR.ONE.add(c).divide(CR.ONE.subtract(c)).floor();
    } else {
      return CR.FOUR.divide(ComputableReals.SINGLETON.tan(CR.PI.divide(mN)).square()).add(1).floor();
    }
  }
}
