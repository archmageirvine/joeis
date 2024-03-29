package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068659 Primes formed from the concatenation of n, n-1 and n for some n &gt; 0.
 * @author Sean A. Irvine
 */
public class A068659 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final StringBuilder sb = new StringBuilder();
      sb.append(++mN);
      sb.append(mN - 1);
      sb.append(mN);
      final Z t = new Z(sb);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
