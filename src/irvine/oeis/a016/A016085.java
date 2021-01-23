package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016085 a(1) = 1; a(n+1) = floor((sum{k=1 to n} a(k)^3)^(1/3)).
 * @author Sean A. Irvine
 */
public class A016085 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    final Z t = ComputableReals.SINGLETON.pow(CR.valueOf(mA), CR.ONE_THIRD).floor();
    mA = mA.add(t.pow(3));
    return t;
  }
}
