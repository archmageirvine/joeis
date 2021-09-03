package irvine.oeis.a108;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007376;

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
      return get(n / 2);
    }
  }
}
