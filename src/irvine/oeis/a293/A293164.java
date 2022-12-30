package irvine.oeis.a293;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a010.A010060;

/**
 * A293164 a(n) = A010060(3n+2).
 * @author Georg Fischer
 */
public class A293164 extends Sequence0 {

  private final A010060 mSeq = new A010060();

  @Override
  public Z next() {
    mSeq.next();
    mSeq.next();
    return mSeq.next();
  }
}
