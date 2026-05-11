package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A084793 For p = prime(n), the number of solutions (g,h) to the equation g^h == h (mod p), where 0 &lt; h &lt; p and g is a primitive root of p; fixed points of the discrete logarithm with base g.
 * @author Sean A. Irvine
 */
public class A084793 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    long cnt = 0;
    for (Z g = Z.ONE; g.compareTo(p) < 0; g = g.add(1)) {
      if (ZUtils.isPrimitiveRoot(g, p)) {
        for (Z h = Z.ONE; h.compareTo(p) < 0; h = h.add(1)) {
          if (g.modPow(h, p).equals(h)) {
            ++cnt;
          }
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
