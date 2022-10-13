package irvine.oeis.a260;

import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;
import irvine.oeis.a000.A000108;

/**
 * A260775 Certain directed lattice paths.
 * @author Georg Fischer
 */
public class A260775 extends A000108 implements SequenceWithOffset {

  private int mN = -1;

  @Override
  public int getOffset() {
    return 0;
  }

  @Override
  public Z next() {
    ++mN;
    Z result = mN == 0 ? super.next() : super.next().multiply2();
    super.next();
    return result;
  }
}
