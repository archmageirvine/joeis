package irvine.oeis.a026;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026352 a(n) = floor(n*tau)+n+1.
 * @author Sean A. Irvine
 */
public class A026352 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return CR.PHI.multiply(++mN).floor().add(mN + 1);
  }
}
