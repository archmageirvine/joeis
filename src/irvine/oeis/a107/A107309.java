package irvine.oeis.a107;
// manually concatf/concatr at 2022-12-30 17:50

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a001.A001359;
import irvine.oeis.a006.A006512;

/**
 * A107309 Concatenation of twin primes in reverse order.
 * @author Georg Fischer
 */
public class A107309 extends Sequence0 {

  private final A001359 mSeq1 = new A001359();
  private final A006512 mSeq2 = new A006512();

  @Override
  public Z next() {
    return new Z(mSeq2.next().toString() + mSeq1.next().toString());
  }
}
