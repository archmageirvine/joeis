package irvine.oeis.a032;
// manually 2024-08-16

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000959;

/**
 * A032601 a(n) = n-th prime number x n-th lucky number.
 * @author Georg Fischer
 */
public class A032601 extends Sequence1 {

  private static final Sequence A000040 = new A000040();
  private static final Sequence mLuckies = new A000959();

  @Override
  public Z next() {
    return mLuckies.next().multiply(A000040.next());
  }
}
