package irvine.oeis.a216;
// manually knestm/knest at 2023-03-02 16:06

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a060.A060797;

/**
 * A216144 Square root of smallest square greater than the product of first n primes.
 * @author Georg Fischer
 */
public class A216144 extends Sequence1 {

  private final A060797 mSeq = new A060797();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return mSeq.next().add(1);
  }
}
