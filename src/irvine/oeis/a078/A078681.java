package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078681 Start with n; iterate the process x -&gt; ceiling(3x/2) until reach a prime. Sequence gives number of steps to reach a prime or 0 if no prime is ever reached.
 * @author Sean A. Irvine
 */
public class A078681 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z t = Z.valueOf(++mN);
    long cnt = 0;
    do {
      t = t.multiply(3).add(1).divide2();
      ++cnt;
    } while (!t.isProbablePrime());
    return Z.valueOf(cnt);
  }
}

