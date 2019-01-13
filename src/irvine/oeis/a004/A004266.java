package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004266.
 * @author Sean A. Irvine
 */
public class A004266 implements Sequence {

  private static final CR C = CR.valueOf(1000).divide(CR.TWO.log());
  private long mN = 0;

  @Override
  public Z next() {
    return CR.valueOf(++mN).log().multiply(C).add(CR.HALF).floor(32);
  }
}
