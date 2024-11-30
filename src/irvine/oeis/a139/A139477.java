package irvine.oeis.a139;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a001.A001109;

/**
 * A139477 Number of binary digits in A001109(n).
 * @author Georg Fischer
 */
public class A139477 extends Sequence0 {

  private final A001109 mSeq = new A001109();

  @Override
  public Z next() {
    return Z.valueOf(mSeq.next().bitLength()).max(Z.ONE);
  }
}
