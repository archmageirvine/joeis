package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078682 Start with n; iterate the process x -&gt; ceiling(3x/2) until reach a prime. Sequence gives primes reached.
 * @author Sean A. Irvine
 */
public class A078682 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z t = Z.valueOf(++mN);
    do {
      t = t.multiply(3).add(1).divide2();
    } while (!t.isProbablePrime());
    return t;
  }
}

