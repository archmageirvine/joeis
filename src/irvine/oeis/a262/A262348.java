package irvine.oeis.a262;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;

/**
 * A262348 a(n) = A000215(n) mod A000045(n).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A262348 extends Sequence1 {

  private final Sequence mSeq2 = new A000045().skip();
  private long mN = 0;

  @Override
  public Z next() {
    final Z f = mSeq2.next();
    return Z.TWO.modPow(Z.ONE.shiftLeft(++mN), f).add(1).mod(f);
  }
}
