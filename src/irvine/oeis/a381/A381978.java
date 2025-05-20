package irvine.oeis.a381;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;

/**
 * A381978 a(n) is the smallest number k such that b+c+d = n, where b, c and d are three distinct positive divisors of k.
 * @author Sean A. Irvine
 */
public class A381978 extends AbstractSequence {

  private long mN = 5;

  /** Construct the sequence. */
  public A381978() {
    super(6);
  }

  @Override
  public Z next() {
    ++mN;
    long m = 1;
    while (true) {
      final long[] d = ZUtils.toLong(Jaguar.factor(++m).divisorsSorted());
      for (int k = 2; k < d.length && d[k] < mN; ++k) {
        for (int j = 1; j < k && d[k] + d[j] < mN; ++j) {
          for (int i = 0; i < j; ++i) {
            if (d[i] + d[j] + d[k] == mN) {
              return Z.valueOf(m);
            }
          }
        }
      }
    }
  }
}
