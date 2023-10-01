package irvine.oeis.a066;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A066657 Numerators of rational numbers produced in order by A066720(j)/A066720(i) for i &gt;= 1, 1 &lt;= j &lt;i.
 * @author Sean A. Irvine
 */
public class A066657 extends A066720 {

  {
    setOffset(0);
  }
  protected int mN = -1;
  private int mM = 0;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return select(new Q(a(mM), a(mN)));
  }
}
