package irvine.oeis.a066;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A066296 a(n) = floor(n^(1/omega(n))).
 * @author Sean A. Irvine
 */
public class A066296 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    return CR.valueOf(++mN).pow(new Q(1, Functions.OMEGA.i(mN))).floor();
  }
}

