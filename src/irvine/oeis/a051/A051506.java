package irvine.oeis.a051;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051506 a(n) = min { n^n, floor(100/sqrt(n)) }.
 * @author Sean A. Irvine
 */
public class A051506 extends Sequence1 {

  private static final CR CR100 = CR.valueOf(100);
  private long mN = 0;

  @Override
  public Z next() {
    return ++mN <= 3 ? Z.valueOf(mN).pow(mN) : CR100.divide(CR.valueOf(mN).sqrt()).floor();
  }
}

