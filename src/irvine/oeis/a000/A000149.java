package irvine.oeis.a000;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000149 a(n) = floor(e^n).
 * @author Sean A. Irvine
 */
public class A000149 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return CR.valueOf(++mN).exp().floor();
  }
}
