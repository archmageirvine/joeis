package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;

/**
 * A022799 <code>a(n) = F(n+1) + c(n)</code> where <code>F(k)</code> is k-th Fibonacci number and <code>c(n)</code> is <code>n-th non-Fibonacci</code> number.
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
