package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;

/**
 * A022799 a(n) = F(n+1) + c(n) where F(k) is k-th Fibonacci number and c(n) is n-th non-Fibonacci number.
 * @author Sean A. Irvine
 */
public class A022799 implements Sequence {

  private final Sequence mA = new SkipSequence(new A000045(), 2);
  private final Sequence mB = new ComplementSequence(new A000045());

  @Override
  public Z next() {
    return mA.next().add(mB.next());
  }
}
