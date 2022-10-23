package irvine.oeis.a005;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005157 Number of totally symmetric plane partitions that fit in an n X n X n box.
 * @author Sean A. Irvine
 */
public class A005157 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Q p = Q.ONE;
    for (int i = 1; i <= mN; ++i) {
      for (int j = i; j <= mN; ++j) {
        for (int k = j; k <= mN; ++k) {
          p = p.multiply(i + j + k - 1).divide(i + j + k - 2);
        }
      }
    }
    return p.toZ();
  }
}
