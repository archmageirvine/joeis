package irvine.oeis.a385;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a010.A010371;

/**
 * A385249 Number of iterations of seven segments count x -&gt; A010371(x) to go from n to a fixed point.
 * @author Sean A. Irvine
 */
public class A385249 extends Sequence0 {

  private final DirectSequence mA = new A010371();
  private int mN = -1;

  @Override
  public Z next() {
    int m = ++mN;
    long cnt = 0;
    while (true) {
      final int t = mA.a(m).intValue();
      if (m == t) {
        return Z.valueOf(cnt);
      }
      m = t;
      ++cnt;
    }
  }
}
