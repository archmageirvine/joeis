package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a007.A007504;

/**
 * A067110 a(n) = floor(concatenation of first n primes / sum of first n primes).
 * @author Georg Fischer
 */
public class A067110 extends A000040 {

  private Sequence mSeq = new A007504();
  private StringBuilder mSb = new StringBuilder();

  {
    mSeq.next(); // skip the leading 0
  }

  @Override
  public Z next() {
    mSb.append(super.next().toString());
    return new Z(mSb.toString()).divide(mSeq.next());
  }
}
