package irvine.oeis.a026;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026314 a(n) = n-th nonnegative integer k satisfying |cos(k)*cos(k+2)| &gt; (cos(k+1))^2.
 * @author Sean A. Irvine
 */
public class A026314 implements Sequence {

  private static final ComputableReals C = ComputableReals.SINGLETON;
  private long mN = -1;

  @Override
  public Z next() {
    CR t;
    do {
      ++mN;
      t = C.cos(CR.valueOf(mN + 1));
    } while (C.cos(CR.valueOf(mN)).multiply(C.cos(CR.valueOf(mN + 2))).abs().compareTo(t.multiply(t)) <= 0);
    return Z.valueOf(mN);
  }
}
