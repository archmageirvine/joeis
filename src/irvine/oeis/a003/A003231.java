package irvine.oeis.a003;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003231 <code>a(n) = floor(n*(sqrt(5)+5)/2)</code>.
 * @author Sean A. Irvine
 */
public class A003231 implements Sequence {

  private static final CR C = CR.FIVE.sqrt().add(CR.FIVE).divide(CR.TWO);
  protected long mN = 0;

  @Override
  public Z next() {
    return C.multiply(CR.valueOf(++mN)).floor(32);
  }
}
