package irvine.oeis.a054;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054404 Number of daughters to wait before picking in sultan's dowry problem with n daughters.
 * @author Sean A. Irvine
 */
public class A054404 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long r = 0;
    Q sr = Q.ZERO;
    for (long s = 1; s <= mN; ++s) {
      Q p = Q.ZERO;
      for (long i = s; i < mN; ++i) {
        p = p.add(new Q(1, i));
      }
      p = p.multiply(new Q(s, mN));
      if (p.compareTo(sr) > 0) {
        r = s;
        sr = p;
      }
    }
    return Z.valueOf(r);
  }
}
