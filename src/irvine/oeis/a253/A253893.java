package irvine.oeis.a253;

import irvine.math.z.Z;
import irvine.oeis.a064.A064216;

/**
 * A253893 a(1) = 0, for n &gt; 1, a(n) = 1 + a(A253889(n)).
 * @author Georg Fischer
 */
public class A253893 extends A064216 {

  @Override
  public Z next() {
    return Z.valueOf(super.next().bitLength() - 1);
  }
}
