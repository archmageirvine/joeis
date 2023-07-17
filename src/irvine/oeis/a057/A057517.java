package irvine.oeis.a057;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

/**
 * A057517 Binary encodings of the Catalan mountain ranges with exactly one sea-level valley, i.e., the rooted plane trees with root degree = 2.
 * @author Sean A. Irvine
 */
public class A057517 extends A014486 {

  /** Construct the sequence. */
  public A057517() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    final SExpression s = SExpression.binexp2pars(super.next());
    final SExpression t = new SExpression();
    t.add(s.car());
    t.add(s.cdr());
    return t.toZ();
  }
}
