package irvine.oeis.a006;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006338 An "eta-sequence": floor((n+1)*sqrt(2) + 1/2) - floor(n*sqrt(2) + 1/2).
 * @author Sean A. Irvine
 */
public class A006338 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return CR.SQRT2.multiply(mN + 1).round()
      .subtract(CR.SQRT2.multiply(mN).round());
  }
}

