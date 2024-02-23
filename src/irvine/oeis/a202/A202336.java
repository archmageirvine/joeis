package irvine.oeis.a202;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A202336 Number of digits in n^(n!).
 * @author Sean A. Irvine
 */
public class A202336 extends A000142 {

  // After Alois P. Heinz

  @Override
  public Z next() {
    final Z f = super.next();
    if (mN == 0) {
      return Z.ONE;
    }
    return CR.valueOf(mN).log10().multiply(f).floor().add(1);
  }
}
