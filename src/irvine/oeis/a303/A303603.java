package irvine.oeis.a303;
// manually simple3 at 2023-03-23 22:27

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a047.A047949;

/**
 * A303603 a(n) is the maximum distance between primes in Goldbach partitions of 2n, or 2n if there are no Goldbach partitions of 2n.
 * @author Georg Fischer
 */
public class A303603 extends AbstractSequence {

  private int mN = 0;
  private final A047949 mSeq = new A047949();

  /** Construct the sequence. */
  public A303603() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 1) ? Z.ZERO : Z.TWO.multiply(mSeq.next());
  }
}
