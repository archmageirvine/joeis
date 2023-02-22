package irvine.oeis.a180;
// manually rootet at 2023-02-20 10:45

import irvine.math.z.Z;
import irvine.oeis.SkipSequence;
import irvine.oeis.a035.A035263;
import irvine.oeis.transform.RootSequence;

/**
 * A180125 Self-convolution of period-doubling sequence A035263.
 * @author Georg Fischer
 */
public class A180125 extends RootSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A180125() {
    super(1, new SkipSequence(new A035263(), 1), 2, 1);
  }

  @Override
  public Z next() {
    return (++mN <= 1) ? Z.ZERO : super.next();
  }
}
