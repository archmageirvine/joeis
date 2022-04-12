package irvine.oeis.a163;
// manually partsumm/partsum at 2022-04-12 19:21

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007504;
import irvine.oeis.a051.A051349;

/**
 * A163061 Sum of the first n primes plus the first n nonprimes.
 * <code>a(n)=A007504(n)+A051349(n-1).</code>
 * @author Georg Fischer
 */
public class A163061 extends A007504 {

  private Sequence mSeq = new A051349();

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().add(mSeq.next());
  }
}
