package irvine.oeis.a327;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A327603 Number of digits in (n^n)^(n^n).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A327603 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return ++mN <= 1 ? Z.ONE : CR.valueOf(mN).log10().multiply(Z.valueOf(mN).pow(mN + 1)).floor().add(1);
  }
}
