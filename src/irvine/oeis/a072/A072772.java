package irvine.oeis.a072;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a014.A014486;

/**
 * A072772 Y-projection of the tabular N X N -&gt; N bijection A072764 and X-projection of its transpose A072766.
 * @author Sean A. Irvine
 */
public class A072772 extends Sequence1 {

  private final Sequence mA014486 = new A014486().skip();

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(SExpression.binexp2pars(mA014486.next()).cdr().toZ());
  }
}
