package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;
import irvine.oeis.a073.A073941;

/**
 * A082416 Parity of A073941(n).
 * @author Georg Fischer
 */
public class A082416 extends A073941 implements SequenceWithOffset {

  @Override
  public int getOffset() {
    return 1;
  }

  @Override
  public Z next() {
    return super.next().testBit(0) ? Z.ONE : Z.ZERO;
  }
}
