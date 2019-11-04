package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022164 First column of spectral array <code>W(sqrt(5)-1)</code>.
 * @author Sean A. Irvine
 */
public class A022164 implements Sequence {

  private static final CR N = CR.FIVE.sqrt().subtract(CR.ONE);

  private long mN = 0;

  @Override
  public Z next() {
    return N.multiply(CR.valueOf(N.multiply(++mN).floor())).floor();
  }
}
