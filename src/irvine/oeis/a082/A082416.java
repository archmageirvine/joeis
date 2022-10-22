package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a073.A073941;

/**
 * A082416 Parity of A073941(n).
 * @author Georg Fischer
 */
public class A082416 extends Sequence1 {

  private final Sequence mSeq = new A073941();

  @Override
  public Z next() {
    return mSeq.next().testBit(0) ? Z.ONE : Z.ZERO;
  }
}
