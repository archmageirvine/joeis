package irvine.oeis.a182;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a060.A060795;
import irvine.oeis.a060.A060796;

/**
 * A182987 Least a + b such that a*b = A002110(n), the product of the first n primes, where a, b are positive integers.
 * @author Georg Fischer
 */
public class A182987 extends AbstractSequence {

  private int mN = -1;

  private final A060795 mSeq1 = new A060795();
  private final A060796 mSeq2 = new A060796();

  /** Construct the sequence. */
  public A182987() {
    super(0);
  }

  @Override
  public Z next() {
    return (++mN == 0) ? Z.TWO : mSeq1.next().add(mSeq2.next());
  }
}
