package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016066 a(n) = round(e^(e^n)).
 * @author Sean A. Irvine
 */
public class A016066 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return CR.valueOf(++mN).exp().exp().round();
  }
}
