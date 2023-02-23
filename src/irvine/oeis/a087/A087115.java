package irvine.oeis.a087;
// manually rootet at 2023-02-21 21:45

import irvine.math.z.Z;
import irvine.oeis.SkipSequence;
import irvine.oeis.a001.A001158;
import irvine.oeis.transform.RootSequence;

/**
 * A087115 Convolution of sum of cubes of divisors with itself.
 * @author Georg Fischer
 */
public class A087115 extends RootSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A087115() {
    super(1, new SkipSequence(new A001158(), 1), 2, 1);
  }

  @Override
  public Z next() {
    return (++mN <= 1) ? Z.ZERO : super.next();
  }
}
