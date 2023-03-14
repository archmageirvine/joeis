package irvine.oeis.a278;
// manually knest at 2023-03-12

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a003.A003726;

/**
 * A278043 Number of 1's in tribonacci representation of n (cf. A278038).
 * @author Georg Fischer
 */
public class A278043 extends Sequence0 {

  private final A003726 mSeq = new A003726();

  @Override
  public Z next() {
    return Z.valueOf(mSeq.next().bitCount());
  }
}
