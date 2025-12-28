package irvine.oeis.a082;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082844 Start with 3,2 and apply the rule a(a(1)+a(2)+...+a(n)) = a(n), fill in any undefined terms with a(t) = 2 if a(t-1) = 3 and a(t) = 3 if a(t-1) = 2.
 * @author Sean A. Irvine
 */
public class A082844 extends Sequence1 {

  private static final CR R = CR.SQRT2.add(1);
  private long mN = 0;

  @Override
  public Z next() {
    return R.multiply(++mN + 2).floor().subtract(R.multiply(mN + 1).floor());
  }
}
