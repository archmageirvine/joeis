package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.math.q.BernoulliSequence;
import irvine.oeis.Sequence;

/**
 * A002445.
 * @author Sean A. Irvine
 */
public class A002445 implements Sequence {

  final BernoulliSequence mB = new BernoulliSequence(0);

  @Override
  public Z next() {
    final Z q = mB.next().den();
    mB.next();
    return q;
  }
}
