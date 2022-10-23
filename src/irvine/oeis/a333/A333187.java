package irvine.oeis.a333;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A333187 a(n) = floor(2^n cot(1/n)).
 * @author Sean A. Irvine
 */
public class A333187 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return ComputableReals.SINGLETON.cot(CR.valueOf(++mN).inverse()).shiftLeft(mN).floor();
  }
}

