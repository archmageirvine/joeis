package irvine.oeis.a353;

import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;
import irvine.oeis.a001.A001001;

/**
 * A353628 Parity of A001001(n), where A001001(n) = Sum_{d|n} d*sigma(d).
 * @author Georg Fischer
 */
public class A353628 extends A001001 implements SequenceWithOffset {

  @Override
  public int getOffset() {
    return 1;
  }

  @Override
  public Z next() {
    return super.next().testBit(0) ? Z.ONE : Z.ZERO;
  }
}
