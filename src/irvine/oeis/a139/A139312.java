package irvine.oeis.a139;
// manually charfm/charf

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a000.A000040;

/**
 * A139312 Characteristic function of the good primes (version 1).
 * @author Georg Fischer
 */
public class A139312 extends Sequence2 {

  private final Sequence mSeq = new A000040();
  private Z mP0 = mSeq.next();
  private Z mP1 = mSeq.next();
  private Z mP2 = mSeq.next();

  @Override
  public Z next() {
    // a(n)=1 if prime(n)^2 - prime(n-1)*prime(n+1) >=0, else a(n)=0.
    final Z result = mP1.square().subtract(mP2.multiply(mP0)).compareTo(Z.ZERO) >= 0 ? Z.ONE : Z.ZERO;
    mP0 = mP1;
    mP1 = mP2;
    mP2 = mSeq.next();
    return result;
  }
}
