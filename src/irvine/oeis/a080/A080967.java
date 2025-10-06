package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057162;
import irvine.oeis.a057.A057164;

/**
 * A057164.
 * @author Sean A. Irvine
 */
public class A080967 extends A014486 {

  @Override
  public Z next() {
    long cnt = 0;
    final Z t = super.next();
    Z u = t;
    do {
      ++cnt;
      u = A057162.reflectBinTree(A057164.bcr(u));
    } while (!u.equals(t));
    return Z.valueOf(cnt);
  }
}

