package irvine.oeis.a348;
// manunally knest at 2023-03-13

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a092.A092391;

/**
 * A348367 a(n) = w(n + w(n)), where w(n) is the binary weight of n, A000120(n).
 * @author Georg Fischer
 */
public class A348367 extends Sequence1 {

  private final A092391 mSeq = new A092391();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(mSeq.next().bitCount());
  }
}
