package irvine.oeis.a108;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007376;
import irvine.oeis.memory.MemorySequence;

/**
 * A108202 a(2n) = A007376(n); a(2n+1) = a(n).
 * @author Georg Fischer
 */
public class A108202 extends MemorySequence {

  private final Sequence mSeq = new A007376();

  @Override
  protected Z computeNext() {
    final int n = size();
    if ((n & 1) == 0) {
      return mSeq.next();
    } else {
      return a(n / 2);
    }
  }
}
