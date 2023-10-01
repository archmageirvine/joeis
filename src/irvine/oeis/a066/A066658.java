package irvine.oeis.a066;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A066658 Denominators of rational numbers produced in order by A066720(j)/A066720(i) for i &gt;= 1, 1 &lt;= j &lt;i.
 * @author Sean A. Irvine
 */
public class A066658 extends A066657 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
