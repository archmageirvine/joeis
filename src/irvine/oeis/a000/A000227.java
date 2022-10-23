package irvine.oeis.a000;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000227 Nearest integer to e^n.
 * @author Sean A. Irvine
 */
public class A000227 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return CR.valueOf(++mN).exp().round();
  }
}
