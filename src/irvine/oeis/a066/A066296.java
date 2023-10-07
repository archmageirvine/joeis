package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A066286.
 * @author Sean A. Irvine
 */
public class A066296 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    return CR.valueOf(++mN).pow(new Q(1, Jaguar.factor(mN).omega())).floor();
  }
}

