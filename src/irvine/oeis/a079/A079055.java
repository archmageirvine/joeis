package irvine.oeis.a079;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a061.A061358;

/**
 * A079055 Numbers of prime pairs (p,q), p&lt;=q, such that (p+q) divides n.
 * @author Sean A. Irvine
 */
public class A079055 extends Sequence1 {

  private final DirectSequence mA = DirectSequence.create(new A061358());
  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, mA::a);
  }
}

