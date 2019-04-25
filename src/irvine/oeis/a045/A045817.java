package irvine.oeis.a045;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045817 Numbers n written in base 7, where in the list of divisors of <code>n (in</code> base 7), each digit <code>0-6</code> appears equally often.
 * @author Sean A. Irvine
 */
public class A045817 implements Sequence {

  private long mN = 1324;

  @Override
  public Z next() {
    while (true) {
      if (A045815.matchingCount(Cheetah.factor(++mN).divisors(), 7) > 0) {
        return new Z(Z.valueOf(mN).toString(7)); // ugly write out in base 7
      }
    }
  }
}
