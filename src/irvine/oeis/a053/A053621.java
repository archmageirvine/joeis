package irvine.oeis.a053;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053621 Nearest integer to n/(log(n)-1).
 * @author Sean A. Irvine
 */
public class A053621 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    return n.divide(n.log().subtract(CR.ONE)).round();
  }
}
