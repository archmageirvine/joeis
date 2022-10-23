package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057032 Let P(n) of a sequence s(1), s(2), s(3), ... be obtained by leaving s(1), ..., s(n-1) fixed and forward-cyclically permuting every n consecutive terms thereafter; apply P(2) to 1, 2, 3, ... to get PS(2), then apply P(3) to PS(2) to get PS(3), then apply P(4) to PS(3), etc. The limit of PS(n) as n -&gt; oo is this sequence.
 * @author Sean A. Irvine
 */
public class A057032 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z a = Z.ZERO;
    for (long k = mN; k > 0; --k) {
      if (a.mod(k) == 0) {
        a = a.add(k);
      }
    }
    return a;
  }
}

