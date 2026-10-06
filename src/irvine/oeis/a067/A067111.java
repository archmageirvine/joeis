package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002110;
import irvine.oeis.a007.A007504;

/**
 * A067111 a(n) = floor( product of first n primes / sum of first n primes ).
 * @author Georg Fischer
 */
public class A067111 extends A002110 {

  private final Sequence mSeq = new A007504();

  {
    setOffset(1);
    super.next(); // skip leading 1
    mSeq.next(); // skip the leading 0
  }

  @Override
  public Z next() {
    return super.next().divide(mSeq.next());
  }
}
