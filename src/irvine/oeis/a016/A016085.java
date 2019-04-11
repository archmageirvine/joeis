package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016085 <code>a(1) = 1</code>; <code>a(n+1) =</code> floor((sum{k=1 to <code>n}</code> a(k)^3)^(1/3)).
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
    final Z t = ComputableReals.SINGLETON.pow(CR.valueOf(mA), CR.ONE_THIRD).floor(32);
    mA = mA.add(t.pow(3));
    return t;
  }
}
