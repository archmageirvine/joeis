package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000105;
import irvine.oeis.a000.A000988;

/**
 * A030228 Number of chiral polyominoes with n cells.
 * @author Sean A. Irvine
 */
public class A030228 extends A000105 {

  private long mAdd = 1;
  private final Sequence mA = new A000988();

  @Override
  public Z next() {
    final Z res = mA.next().subtract(super.next()).add(mAdd);
    mAdd = 0;
    return res;
  }
}
