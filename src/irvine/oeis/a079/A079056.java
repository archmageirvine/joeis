package irvine.oeis.a079;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a068.A068307;

/**
 * A079056 Numbers of prime triples (p,q,r), p&lt;=q&lt;=r, such that (p+q+r) divides n.
 * @author Sean A. Irvine
 */
public class A079056 extends Sequence1 {

  private final DirectSequence mA = DirectSequence.create(new A068307());
  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, mA::a);
  }
}

