package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005117;

/**
 * A077687 a(n) = n-th squarefree number beginning with n.
 * @author Sean A. Irvine
 */
public class A077687 extends Sequence1 {

  private long mN = 0;

  private Z findNext(final Sequence seq, final String ns) {
    while (true) {
      final Z s = seq.next();
      if (s.toString().startsWith(ns)) {
        return s;
      }
    }
  }

  @Override
  public Z next() {
    final String ns = String.valueOf(++mN);
    final Sequence seq = new A005117();
    for (long k = 1; k < mN; ++k) {
      findNext(seq, ns);
    }
    return findNext(seq, ns);
  }
}
