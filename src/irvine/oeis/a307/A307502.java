package irvine.oeis.a307;
// manually rootet at 2023-02-20 10:45

import irvine.math.z.Z;
import irvine.oeis.a001.A001615;
import irvine.oeis.transform.RootSequence;

/**
 * A307502 Self-convolution of the Dedekind psi function (A001615).
 * @author Georg Fischer
 */
public class A307502 extends RootSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A307502() {
    super(1, new A001615().skip(1), 2, 1);
  }

  @Override
  public Z next() {
    return (++mN <= 1) ? Z.ZERO : super.next();
  }
}
