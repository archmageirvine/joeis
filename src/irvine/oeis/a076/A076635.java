package irvine.oeis.a076;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence2;

/**
 * A076635 Let b(1)=1/n, b(2)=1, b(k+1)=abs(b(k))-b(k-1)^2; then b(k) is &gt;0 for k&gt;a(n).
 * @author Sean A. Irvine
 */
public class A076635 extends Sequence2 implements Conjectural {

  private static final long HEURISTIC = 100;
  private long mN = 1;

  @Override
  public Z next() {
    CR a = CR.valueOf(new Q(1, ++mN));
    CR b = CR.ONE;
    long k = 1;
    long lastNonPositive = 0;
    while (lastNonPositive + HEURISTIC > k) {
      final CR t = b.abs().subtract(a.square());
      a = b;
      b = t;
      ++k;
      if (t.signum() <= 0) {
        lastNonPositive = k;
      }
    }
    return Z.valueOf(lastNonPositive + 1);
  }
}
