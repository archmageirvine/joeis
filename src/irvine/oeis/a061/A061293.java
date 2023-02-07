package irvine.oeis.a061;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061293 a(n) = floor( n^e ), e = 2.718281828...
 * @author Sean A. Irvine
 */
public class A061293 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return CR.valueOf(++mN).pow(CR.E).floor();
  }
}
