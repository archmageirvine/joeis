package irvine.oeis.a115;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.AliquotSequence;
import irvine.oeis.Sequence1;

/**
 * A115350 Termination of the aliquot sequence starting at n.
 * @author Sean A. Irvine
 */
public class A115350 extends Sequence1 {

  protected Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final AliquotSequence as = new AliquotSequence(mN);
    final HashSet<Z> seen = new HashSet<>();
    seen.add(Z.ZERO);
    seen.add(Z.ONE);
    Z a = as.next();
    seen.add(a);
    Z b;
    while (seen.add(b = as.next())) {
      a = b;
    }
    return a;
  }
}
