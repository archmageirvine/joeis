package irvine.oeis.a076;
// manually rootet at 2023-02-21 21:45

import irvine.math.z.Z;
import irvine.oeis.a005.A005171;
import irvine.oeis.transform.RootSequence;

/**
 * A076608 Number of nonprimes k &lt; n such that also n-k is not a prime.
 * @author Georg Fischer
 */
public class A076608 extends RootSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A076608() {
    super(1, new A005171().skip(1), 2, 1);
  }

  @Override
  public Z next() {
    return (++mN <= 1) ? Z.ZERO : super.next();
  }
}
