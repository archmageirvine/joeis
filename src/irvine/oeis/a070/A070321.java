package irvine.oeis.a070;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A070321 Greatest squarefree number &lt;= n.
 * @author Georg Fischer
 */
public class A070321 extends Sequence1 implements DirectSequence {

  private long mN = 0;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(Z n) {
    while (!Predicates.SQUARE_FREE.is(n)) {
      n = n.subtract(1);
    }
    return n;
  }

  @Override
  public Z a(long n) {
    while (!Predicates.SQUARE_FREE.is(n)) {
      --n;
    }
    return Z.valueOf(n);
  }

}
