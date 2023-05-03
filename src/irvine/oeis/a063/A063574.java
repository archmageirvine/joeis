package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063574 Number of steps to reach an integer == 1 (mod 4) when iterating the map n -&gt; 3n/2 if n even or (3n+1)/2 if n odd.
 * @author Sean A. Irvine
 */
public class A063574 extends Sequence1 {

  private long mN = 0;

  private Z step(final Z n) {
    return n.isEven() ? n.multiply(3).divide2() : n.multiply(3).add(1).divide2();
  }

  @Override
  public Z next() {
    Z t = Z.valueOf(++mN);
    long cnt = 0;
    while (t.mod(4) != 1) {
      t = step(t);
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
