package irvine.oeis.a293;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a010.A010060;

/**
 * A293163 a(n) = A010060(3n+1).
 * @author Georg Fischer
 */
public class A293163 extends Sequence0 {

  private final A010060 mSeq = new A010060();

  @Override
  public Z next() {
    mSeq.next();
    final Z result = mSeq.next();
    mSeq.next();
    return result;
  }
}
