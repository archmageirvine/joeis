package irvine.oeis.a066;

import irvine.math.Mobius;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066779 Sum of squarefree numbers &lt;= n.
 * @author Georg Fischer
 */
public class A066779 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    // a(n) = Sum_{i=1..n} mu(i)^2*i.
    ++mN;
    return Integers.SINGLETON.sum(1, mN, i -> Z.valueOf(Mobius.mobius(i)).square().multiply(i));
  }
}
