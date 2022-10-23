package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;

/**
 * A022800 a(n) = F(n+2) + c(n) where F(k) is k-th Fibonacci number and c(n) is n-th number that is 1 or is a non-Fibonacci number.
 * @author Sean A. Irvine
 */
public class A022800 extends Sequence1 {

  private final Sequence mA = new SkipSequence(new A000045(), 3);
  private final Sequence mB = new PrependSequence(new ComplementSequence(new A000045()), 1);

  @Override
  public Z next() {
    return mA.next().add(mB.next());
  }
}
