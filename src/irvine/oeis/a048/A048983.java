package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002808;

/**
 * A048983 As n runs through composite numbers, a(n) = number of composite d &lt; n such that gcd(d,n) = 1.
 * @author Sean A. Irvine
 */
public class A048983 extends A002808 {

  @Override
  public Z next() {
    long cnt = 0;
    final Z t = super.next();
    final Sequence comp = new A002808();
    Z a;
    while (!(a = comp.next()).equals(t)) {
      if (t.gcd(a).equals(Z.ONE)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

