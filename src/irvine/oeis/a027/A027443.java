package irvine.oeis.a027;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027443 For <code>n != 1 mod 3</code>, we can write <code>3/(2n+1) = 1/a + 1/b + 1/c</code> with <code>a&gt;b&gt;c&gt;0</code>, a,b,c distinct and odd; sequence gives smallest such a, or 1 if <code>n = 1 mod 3</code>.
 * @author Sean A. Irvine
 */
public class A027443 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN % 3 == 1) {
      return Z.ONE;
    }
    final long m = 2 * mN + 1;
    final Q target = new Q(3, m);
    final Q t = new Q(m);
    long a = m;
    while (true) {
      final Q aq = new Q(1, a);
      for (long b = 3; b < a; b += 2) {
        final Q bq = aq.add(new Q(1, b));
        if (bq.compareTo(target) < 0) {
          final Q c = t.divide(Q.THREE.subtract(bq.multiply(m)));
          if (c.isInteger()) {
            final long cc = c.toZ().longValue();
            if (cc > 0 && cc < b && (cc & 1) == 1) {
              return Z.valueOf(a);
            }
          }
        }
      }
      ++a;
    }
  }
}
