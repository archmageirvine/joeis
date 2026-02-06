package irvine.oeis.a388;

import java.util.HashMap;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A388722 a(n) is the number of steps to reach 0 or the start of a cycle using the iteration x -&gt; |sigma(x)-2*x| starting from x=n.
 * @author Sean A. Irvine
 */
public class A388722 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z x = Z.valueOf(++mN);
    long cnt = 0;
    final HashMap<Z, Long> map = new HashMap<>();
    while (map.putIfAbsent(x, cnt) == null) {
      ++cnt;
      x = Functions.SIGMA1.z(x).subtract(x.multiply2()).abs();
    }
    return Z.valueOf(x.isZero() ? cnt : map.get(x));
  }
}
