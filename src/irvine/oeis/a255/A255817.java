package irvine.oeis.a255;

import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;
import irvine.oeis.a000.A000788;

/**
 * A255817 Parity of A000788, which is the total number of ones in 0..n in binary.
 * @author Georg Fischer
 */
public class A255817 extends A000788 implements SequenceWithOffset {

  @Override
  public int getOffset() {
    return 0;
  }

  @Override
  public Z next() {
    return super.next().testBit(0) ? Z.ONE : Z.ZERO;
  }
}
