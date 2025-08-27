package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a071.A071925;

/**
 * A079793 Smallest multiple of n having an equal number of ones and zeros and no other digits.
 * @author Sean A. Irvine
 */
public class A079793 extends Sequence1 {

  // See Robert Israel's Maple for a better method

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Sequence s = new A071925();
    while (true) {
      final Z t = s.next();
      if (t.mod(mN) == 0) {
        return t;
      }
    }
  }
}

