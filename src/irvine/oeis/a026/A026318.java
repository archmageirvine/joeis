package irvine.oeis.a026;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026318 <code>a(n) = n-th</code> nonnegative integer k satisfying <code>sin(k) &lt; cos(k) &lt; sin(k+1)</code>.
 * @author Sean A. Irvine
 */
public class A026318 implements Sequence {

  private static final ComputableReals C = ComputableReals.SINGLETON;
  private long mN = -1;

  @Override
  public Z next() {
    CR t;
    do {
      ++mN;
      t = C.cos(CR.valueOf(mN));
    } while (C.sin(CR.valueOf(mN)).compareTo(t) >= 0 || t.compareTo(C.sin(CR.valueOf(mN + 1))) >= 0);
    return Z.valueOf(mN);
  }
}
