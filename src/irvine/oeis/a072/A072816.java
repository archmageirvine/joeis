package irvine.oeis.a072;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a051.A051626;
import irvine.oeis.a051.A051628;

/**
 * A072816 a(n) is the smallest integer such that the mantissa of 1/a(n) contains n.
 * @author Sean A. Irvine
 */
public class A072816 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final String s = String.valueOf(mN);
    final Sequence pre = new A051628();
    final Sequence per = new A051626();
    int k = 0;
    while (true) {
      final int digits = pre.next().add(per.next().multiply2()).intValueExact();
      final String t = new Q(Z.TEN.pow(digits), ++k).toZ().toString();
      final int pos = t.indexOf(s);
      if (pos >= 0 && (mN % 10 != 0 || pos < t.length() - s.length())) {
        return Z.valueOf(k);
      }
    }
  }
}
