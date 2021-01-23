package irvine.oeis.a038;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038127 a(n) = floor(n*2^sqrt(2)).
 * @author Sean A. Irvine
 */
public class A038127 implements Sequence {

  private static final CR C = ComputableReals.SINGLETON.pow(CR.TWO, CR.TWO.sqrt());
  private long mN = -1;

  @Override
  public Z next() {
    return C.multiply(++mN).floor();
  }
}
