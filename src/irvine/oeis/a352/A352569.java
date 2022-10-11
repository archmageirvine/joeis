package irvine.oeis.a352;

import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;
import irvine.oeis.a109.A109812;

/**
 * A352569 Parity of A109812.
 * @author Georg Fischer
 */
public class A352569 extends A109812 implements SequenceWithOffset {

  @Override
  public int getOffset() {
    return 1;
  }

  @Override
  public Z next() {
    return super.next().testBit(0) ? Z.ONE : Z.ZERO;
  }
}
