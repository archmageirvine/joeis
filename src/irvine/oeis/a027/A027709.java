package irvine.oeis.a027;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A027709 Minimal perimeter of polyomino with n square cells.
 * @author Sean A. Irvine
 */
public class A027709 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return CR.valueOf(++mN).sqrt().multiply(CR.TWO).ceil().multiply2();
  }
}
