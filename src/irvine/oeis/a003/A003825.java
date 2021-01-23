package irvine.oeis.a003;

import java.util.List;

import irvine.math.z.Z;

/**
 * A003825 Numbers that are the sum of two positive cubes in at least three ways (primitive solutions).
 * @author Sean A. Irvine
 */
public class A003825 extends A003824 {

  @Override
  protected Z a(final Z n) {
    return n.pow(3);
  }

  @Override
  protected boolean isPrimitive(final List<MyTriple> triples) {
    Z gcd = null;
    for (final MyTriple a : triples) {
      final Z ga = a.mid().gcd(a.right());
      gcd = gcd == null ? ga : gcd.gcd(ga);
    }
    return Z.ONE.equals(gcd);
  }

  @Override
  protected int count() {
    return 3;
  }
}
