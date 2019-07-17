package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a004.A004431;

/**
 * A024513 <code>a(n) =</code> position of <code>n^2 + (n+1)^2</code> in <code>A004431</code> (sums of 2 distinct nonzero squares).
 * @author Sean A. Irvine
 */
public class A024513 extends A004431 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    final Z t = Z.valueOf(++mM).square().add(Z.valueOf(mM + 1).square());
    while (true) {
      ++mN;
      if (super.next().equals(t)) {
        return Z.valueOf(mN);
      }
    }
  }
}

