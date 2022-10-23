package irvine.oeis.a047;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A047785 a(n) = ceiling(Li(n)).
 * @author Sean A. Irvine
 */
public class A047785 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    return CR.valueOf(++mN).li().ceil();
  }
}
