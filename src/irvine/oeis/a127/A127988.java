package irvine.oeis.a127;

import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;
import irvine.oeis.a000.A000695;

/**
 * A127988 Sequence determining the parity of A025748.
 * @author Georg Fischer
 */
public class A127988 extends A000695 implements SequenceWithOffset {

  @Override
  public int getOffset() {
    return 0;
  }

  @Override
  public Z next() {
    return super.next().multiply(8);
  }
}
