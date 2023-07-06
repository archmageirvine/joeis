package irvine.oeis.a333;
// manually rootet at 2023-02-21 21:45

import irvine.math.z.Z;
import irvine.oeis.a000.A000720;
import irvine.oeis.transform.RootSequence;

/**
 * A333700 a(n) = Sum_{k=1..n} pi(k) * pi(n-k).
 * @author Georg Fischer
 */
public class A333700 extends RootSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A333700() {
    super(1, new A000720().skip(2), 2, 1);
  }

  @Override
  public Z next() {
    return (++mN <= 3) ? Z.ZERO : super.next();
  }
}
