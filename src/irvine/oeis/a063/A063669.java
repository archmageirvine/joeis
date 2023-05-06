package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a020.A020885;

/**
 * A063669 Hypotenuses of reciprocal Pythagorean triangles: number of solutions to 1/(12n)^2 = 1/b^2 + 1/c^2 [with b &gt;= c &gt; 0]; also number of values of A020885 (with repetitions) which divide n.
 * @author Sean A. Irvine
 */
public class A063669 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Sequence a = new A020885();
    long cnt = 0;
    while (true) {
      final Z t = a.next();
      if (t.compareTo(mN) > 0) {
        break;
      }
      if (mN.mod(t).isZero()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
