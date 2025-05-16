package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005117;

/**
 * A077336 Smallest squarefree number beginning with n.
 * @author Sean A. Irvine
 */
public class A077336 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final String ns = String.valueOf(++mN);
    final Sequence seq = new A005117();
    while (true) {
      final Z s = seq.next();
      if (s.toString().startsWith(ns)) {
        return s;
      }
    }
  }
}
