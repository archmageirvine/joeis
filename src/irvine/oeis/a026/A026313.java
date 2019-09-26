package irvine.oeis.a026;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026313 Numbers n such that <code>|sin(n)*sin(n+2)| &lt; (sin(n+1))^2</code>.
 * @author Sean A. Irvine
 */
public class A026313 implements Sequence {

  private static final ComputableReals C = ComputableReals.SINGLETON;
  private long mN = -1;

  @Override
  public Z next() {
    CR t;
    do {
      ++mN;
      t = C.sin(CR.valueOf(mN + 1));
    } while (C.sin(CR.valueOf(mN)).multiply(C.sin(CR.valueOf(mN + 2))).abs().compareTo(t.multiply(t)) >= 0);
    return Z.valueOf(mN);
  }
}
