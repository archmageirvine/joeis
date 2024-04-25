package irvine.oeis.a174;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A174407 The number of primitive roots g such that there exists an x with g^x == x (mod p), where p=prime(n).
 * @author Sean A. Irvine
 */
public class A174407 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    long cnt = 0;
    for (Z g = Z.ONE; g.compareTo(p) < 0; g = g.add(1)) {
      if (ZUtils.isPrimitiveRoot(g, p)) {
        for (Z x = Z.ONE; x.compareTo(p) < 0; x = x.add(1)) {
          if (g.modPow(x, p).equals(x)) {
            ++cnt;
            break;
          }
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
