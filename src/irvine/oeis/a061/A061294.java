package irvine.oeis.a061;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061294 a(n) = floor( n^Pi ).
 * @author Sean A. Irvine
 */
public class A061294 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return CR.valueOf(++mN).pow(CR.PI).floor();
  }
}
