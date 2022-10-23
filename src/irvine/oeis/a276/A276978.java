package irvine.oeis.a276;
// manually 2022-04-27

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A276978 a(n) = (ceiling(n/2))^n.
 * @author Georg Fischer
 */
public class A276978 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return new Q(mN, 2).ceiling().pow(mN);
  }
}

