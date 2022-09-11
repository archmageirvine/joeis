package irvine.oeis.a110;

import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;

/**
 * A110724 {n concatenate R(n)} + {R(n) concatenate n}, where R(n) = digit reversal of n.
 * @author Georg Fischer
 */
public class A110724 implements SequenceWithOffset {

  private long mN = -1;

  @Override
  public int getOffset() {
    return 0;
  }

  @Override
  public Z next() {
    ++mN;
    final String forward = String.valueOf(mN);
    final String reverse = new StringBuilder().append(forward).reverse().toString();
    return new Z(forward + reverse).add(new Z(reverse + forward));
  }
}
