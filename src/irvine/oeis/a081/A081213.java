package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A081213 Let r(n,k) = if k=0 then n, else r(A081210(n),k-1), then a(n)=r(n, A081212(n)).
 * @author Sean A. Irvine
 */
public class A081213 extends Sequence1 {

  private final DirectSequence mA = new A081210();
  private long mN = 0;

  @Override
  public Z next() {
    Z u = Z.valueOf(++mN);
    while (true) {
      final Z t = mA.a(u);
      if (t.equals(u)) {
        return t;
      }
      u = t;
    }
  }
}
