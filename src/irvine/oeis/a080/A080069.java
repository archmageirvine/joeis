package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057162;
import irvine.oeis.a057.A057164;
import irvine.oeis.a079.A079946;

/**
 * A080069 a(n) = A014486(A080068(n)).
 * @author Sean A. Irvine
 */
public class A080069 extends A014486 {

  private Z mM = null;
  private final DirectSequence mA = new A079946();

  @Override
  public Z next() {
    mM = mM == null ? Z.ZERO : A057162.reflectBinTree(mA.a(A057164.bcr(mM)));
    return mM;
  }
}

