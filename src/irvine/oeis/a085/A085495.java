package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085495 Maximal order of a finite subgroup of the group GL(n,Q).
 * @author Sean A. Irvine
 */
public class A085495 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final Z t = Functions.FACTORIAL.z(++mN).shiftLeft(mN);
    switch (mN) {
      case 2:
        return t.multiply(3).divide(2);
      case 4:
        return t.multiply(3);
      case 6:
      case 10:
        return t.multiply(9).divide(4);
      case 7:
        return t.multiply(9).divide2();
      case 8:
        return t.multiply(135).divide2();
      case 9:
        return t.multiply(15).divide2();
      default:
        return t;
    }
  }
}
