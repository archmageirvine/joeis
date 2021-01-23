package irvine.oeis.a027;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027442 For n odd, &gt;1, not divisible by 3, we can write 3/n = 1/a + 1/b + 1/c with a&gt;b&gt;c&gt;0, a,b,c distinct and odd; sequence gives smallest a.
 * @author Sean A. Irvine
 */
public class A027442 implements Sequence {

  private long mN = 3;

  @Override
  public Z next() {
    mN += 2;
    if (mN % 3 == 0) {
      mN += 2;
    }
    final Q target = new Q(3, mN);
    final Q t = new Q(mN);
    long a = mN;
    while (true) {
      final Q aq = new Q(1, a);
      for (long b = 3; b < a; b += 2) {
        final Q bq = aq.add(new Q(1, b));
        if (bq.compareTo(target) < 0) {
          final Q c = t.divide(Q.THREE.subtract(bq.multiply(mN)));
          if (c.isInteger()) {
            final long cc = c.toZ().longValue();
            if (cc > 0 && cc < b && (cc & 1) == 1) {
              return Z.valueOf(a);
            }
          }
//          for (long c = 1; c < b; c += 2) {
//            final Q cq = bq.add(new Q(1, c));
//            final int cmp = cq.compareTo(target);
//            if (cmp == 0) {
//              return Z.valueOf(a);
//            } else if (cmp < 0) {
//              break;
//            }
//          }
        }
      }
      ++a;
    }
  }
}
