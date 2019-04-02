package irvine.oeis.a000;

import irvine.math.Hypersphere;
import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000223 Let A(n) = #{(i,j,k): i^2 + j^2 + k^2 &lt;= n}, V(n) = (4/3)Pi*n^(3/2), P(n) = A(n) - V(n); A000092 gives values of n where |P(n)| sets a new record; sequence gives (nearest integer to, I believe) P(A000092(n)).
 * @author Sean A. Irvine
 */
public class A000223 implements Sequence {

  // 1000 digits rational approximation to pi
  private static final Q PI = new Q(new Z(CR.PI.toString(999, 10).replace(".", "")), Z.TEN.pow(999));
  private static final Q FOUR_THIRDS_PI = PI.multiply(4).divide(3);
  // used to compute n^(3/2) with reasonable accuracy
  private static final Z UP_SCALE = Z.ONE.shiftLeft(600);
  private static final Z DOWN_SCALE = Z.ONE.shiftLeft(600 * 3 / 2);

  private final A000092 mSeq = new A000092();

  private Q v(final long n) {
    final Z m = Z.valueOf(n).multiply(UP_SCALE);
    return FOUR_THIRDS_PI.multiply(m.pow(3).sqrt()).divide(DOWN_SCALE);
  }

  @Override
  public Z next() {
    final Z nz = mSeq.next();
    final int n = nz.intValue();
    final Z c = Hypersphere.countPoints(3, n);
    final Q cr = new Q(c, Z.ONE).subtract(v(n));
    return cr.add(Q.HALF).toZ();
  }
}

