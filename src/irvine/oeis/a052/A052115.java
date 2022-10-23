package irvine.oeis.a052;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052115 Number of nonnegative integer pairs (i,j) with binomial(i+r,r) + binomial(j+r,r) &lt;= binomial(n+r,r), r=2.
 * @author Sean A. Irvine
 */
public class A052115 extends Sequence0 {

  // After Michel Marcus

  private long mN = -1;

  protected long add() {
    return 2;
  }

  @Override
  public Z next() {
    final Z b2 = Binomial.binomial(++mN + add(), add());
    long sum = 0;
    for (long i = 0; i <= mN; ++i) {
      for (long j = 0; j <= i; ++j) {
        if (Binomial.binomial(i + add(), add()).add(Binomial.binomial(j + add(), add())).compareTo(b2) <= 0) {
          sum += j == i ? 1 : 2;
        }
      }
    }
    return Z.valueOf(sum);
  }
}
