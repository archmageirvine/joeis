package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075860 a(n) is the fixed point reached when the map x -&gt; A008472(x) is iterated, starting from x = n, with the convention a(1)=0.
 * @author Sean A. Irvine
 */
public class A075860 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    Z m = Z.valueOf(mN);
    while (true) {
      final Z t = Functions.SOPF.z(m);
      if (t.equals(m)) {
        return t;
      }
      m = t;
    }
  }
}
