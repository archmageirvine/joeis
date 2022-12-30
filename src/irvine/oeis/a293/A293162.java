package irvine.oeis.a293;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a010.A010060;

/**
 * A293162 Take every third term of the {0,1}-version of the Thue-Morse sequence: a(n) = A010060(3n).
 * @author Georg Fischer
 */
public class A293162 extends Sequence0 {

  private final A010060 mSeq = new A010060();

  @Override
  public Z next() {
    final Z result = mSeq.next();
    mSeq.next();
    mSeq.next();
    return result;
  }
}
