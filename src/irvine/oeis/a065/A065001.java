package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A065001 a(n) = (presumed) number of palindromes in the 'Reverse and Add!' trajectory of n, or -1 if this number is not finite.
 * @author Sean A. Irvine
 */
public class A065001 extends Sequence1 implements Conjectural {

  private static final int HEURISTIC_TERMS = 500;
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z m = mN;
    long count = 0;
    long c = 0;
    while (c < HEURISTIC_TERMS) {
      final Z reverse = ZUtils.reverse(m);
      if (reverse.equals(m)) {
        ++count;
        c = 0;
      }
      m = m.add(reverse);
      ++c;
    }
    return Z.valueOf(count);
  }
}
