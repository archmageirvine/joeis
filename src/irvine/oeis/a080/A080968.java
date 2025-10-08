package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a057.A057162;
import irvine.oeis.a057.A057164;

/**
 * A080910.
 * @author Sean A. Irvine
 */
public class A080968 extends A080981 {

  @Override
  public Z next() {
    final Z t = super.next();
    long cnt = 0;
    Z v = t;
    do {
      v = A057162.reflectBinTree(A057164.bcr(v));
      ++cnt;
    } while (!v.equals(t));
    return Z.valueOf(cnt);
  }
}

