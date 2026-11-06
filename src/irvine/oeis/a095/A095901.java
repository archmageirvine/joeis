package irvine.oeis.a095;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a004.A004001;

/**
 * A095901 A004001 (mod 2).
 * @author Georg Fischer
 */
public class A095901 extends Sequence1 implements DirectSequence {

  private final DirectSequence A004001 = new A004001();

  @Override
  public Z next() {
    return A004001.next().mod(Z.TWO);
  }

  @Override
  public Z a(final Z n) {
    return A004001.a(n).mod(Z.TWO);
  }

  @Override
  public Z a(final long n) {
    return A004001.a(n).mod(Z.TWO);
  }

}
