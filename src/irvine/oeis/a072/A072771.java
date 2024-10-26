package irvine.oeis.a072;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057120;

/**
 * A072750.
 * @author Sean A. Irvine
 */
public class A072771 extends Sequence1 {

  private final Sequence mA014486 = new A014486().skip();

  @Override
  public Z next() {
    return A057120.catalanGlobalRank(SExpression.binexp2pars(mA014486.next()).car().toZ());
  }
}
