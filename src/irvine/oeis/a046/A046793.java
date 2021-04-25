package irvine.oeis.a046;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a005.A005279;

/**
 * A046793 Numbers n such that arithmetic and harmonic means of a(n) and A005279(n) both integers.
 * @author Sean A. Irvine
 */
public class A046793 extends A005279 {

  @Override
  public Z next() {
    final Z t = super.next();
    final Q rt = new Q(Z.ONE, t);
    Z s = Z.TWO.subtract(t.and(Z.ONE));
    while (rt.add(new Q(Z.ONE, s)).num().compareTo(Z.TWO) > 0) {
      s = s.add(2);
    }
    return s;
  }
}

