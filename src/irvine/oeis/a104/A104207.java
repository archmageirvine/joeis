package irvine.oeis.a104;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a001.A001359;
import irvine.oeis.a006.A006512;

/**
 * A104207 Concatenation of consecutive twin primes.
 * @author Georg Fischer
 */
public class A104207 extends Sequence0 {

  private final A001359 mSeq1 = new A001359();
  private final A006512 mSeq2 = new A006512();

  @Override
  public Z next() {
    return new Z(mSeq1.next().toString() + mSeq2.next().toString() + mSeq1.next().toString() + mSeq2.next().toString());
  }
}
