package irvine.oeis.a053;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053619.
 * @author Sean A. Irvine
 */
public class A053621 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    return n.divide(n.log().subtract(CR.ONE)).round();
  }
}
