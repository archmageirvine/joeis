package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;

/**
 * A022809 <code>a(n) = F(n+3) + c(n)</code> where <code>F(k)</code> is k-th Fibonacci number and <code>c(n)</code> is n-th number that is 1 or 2 or is not a Fibonacci number.
 * @author Sean A. Irvine
 */
public class A022809 implements Sequence {

  private final Sequence mA = new SkipSequence(new A000045(), 4);
  private final Sequence mB = new PrependSequence(new ComplementSequence(new A000045()), 1, 2);

  @Override
  public Z next() {
    return mA.next().add(mB.next());
  }
}
