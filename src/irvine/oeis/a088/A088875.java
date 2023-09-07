package irvine.oeis.a088;
// manually 2023-09-07/filtpos at 2023-09-07 21:05

import irvine.math.z.Z;
import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.LambdaSequence;

/**
 * A088875 Cyclotomic(n,-n) is prime.
 * @author Georg Fischer
 */
public class A088875 extends FilterPositionSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A088875() {
    super(1, 1, new LambdaSequence(1, n -> Cyclotomic.cyclotomic(n, -n)), PROBABLE_PRIME);
  }

  @Override
  public Z next() {
    return (++mN == 1) ? Z.ONE : super.next();
  }
}
