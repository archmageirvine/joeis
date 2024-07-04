package irvine.oeis.a079;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

/**
 * A079436 Full \u0141ukasiewicz word for each rooted plane tree (interpretation e in Stanley's exercise 19) encoded by A014486 (or A063171).
 * @author Sean A. Irvine
 */
public class A079436 extends A014486 {

  private Z lukasiewicz(final SExpression e) {
    final StringBuilder sb = new StringBuilder();
    sb.append(e.size());
    for (final SExpression s : e) {
      sb.append(lukasiewicz(s));
    }
    return new Z(sb);
  }

  @Override
  public Z next() {
    return lukasiewicz(SExpression.binexp2pars(super.next()));
  }
}
