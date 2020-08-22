package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;


/**
 * A002721 Number of 3 X 3 X 3 arrays M_ijk (1 &lt;= i,j,k &lt;= 3) with entries satisfying 0 &lt;= M_ijk &lt;= n and all line sums equal to n.
 * @author Sean A. Irvine
 */
public class A002721 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z m = mN.multiply(mN.add(1));
    return m.multiply(31).add(1004).multiply(m).add(6820).multiply(m).add(4272).multiply(m).divide(4032).add(1);
  }
}
