package irvine.oeis.a268;
// manually rootet at 2023-02-21 21:45

import irvine.math.z.Z;
import irvine.oeis.SkipSequence;
import irvine.oeis.a006.A006068;
import irvine.oeis.transform.RootSequence;

/**
 * A268721 Convolution of A006068 (inverse of Gray code) with itself: a(n) = Sum_{k=1..n+1} A006068(k) * A006068(1+n-k).
 * @author Georg Fischer
 */
public class A268721 extends RootSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A268721() {
    super(0, new SkipSequence(new A006068(), 2), 2, 1);
  }

  @Override
  public Z next() {
    return (++mN <= 0) ? Z.ZERO : super.next();
  }
}
