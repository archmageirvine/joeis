package irvine.oeis.a007;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007067 Nearest integer to <code>n*tau</code>.
 * @author Sean A. Irvine
 */
public class A007067 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return CR.PHI.multiply(CR.valueOf(++mN)).round(32);
  }
}
