package irvine.oeis.a007;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007069 First column of spectral array W(sqrt <code>2)</code>.
 * @author Sean A. Irvine
 */
public class A007069 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return CR.SQRT2.multiply(CR.valueOf(CR.SQRT2.multiply(CR.valueOf(++mN)).floor(32))).floor(32);
  }
}
