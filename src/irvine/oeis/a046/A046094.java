package irvine.oeis.a046;

import irvine.math.group.IntegersModMul;
import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046094 Agoh's congruence; a(n) is conjectured to be 1 iff n is prime.
 * @author Sean A. Irvine
 */
public class A046094 implements Sequence {

  private final BernoulliSequence mB = new BernoulliSequence(0);
  private long mN = 0;

  @Override
  public Z next() {
    final Q b = mB.nextQ().multiply(-++mN);
    if (mN == 1) {
      return Z.ZERO;
    }
    final IntegersModMul r = new IntegersModMul(mN);
    return r.add(b.num(), r.negate(b.den()));
  }
}
