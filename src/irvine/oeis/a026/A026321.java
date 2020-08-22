package irvine.oeis.a026;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026321 n-th nonnegative integer k satisfying |sin(k)| &gt; |cos(k)| &gt; |sin(k+1)|.
 * @author Sean A. Irvine
 */
public class A026321 implements Sequence {

  private static final ComputableReals C = ComputableReals.SINGLETON;
  private long mN = -1;

  @Override
  public Z next() {
    CR t;
    do {
      ++mN;
      t = C.cos(CR.valueOf(mN)).abs();
    } while (C.sin(CR.valueOf(mN)).abs().compareTo(t) <= 0 || t.compareTo(C.sin(CR.valueOf(mN + 1)).abs()) <= 0);
    return Z.valueOf(mN);
  }
}
