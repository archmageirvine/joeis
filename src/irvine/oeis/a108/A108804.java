package irvine.oeis.a108;
// manually rootet at 2023-02-20 10:45

import irvine.math.z.Z;
import irvine.oeis.a010.A010060;
import irvine.oeis.transform.RootSequence;

/**
 * A108804 Self-convolution of A010060 (Thue-Morse sequence).
 * @author Georg Fischer
 */
public class A108804 extends RootSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A108804() {
    super(0, new A010060().skip(2), 2, 1);
  }

  @Override
  public Z next() {
    return (++mN <= 1) ? Z.ZERO : super.next();
  }
}
