package irvine.oeis.a344;
// manually knest/jaguarz at 2023-03-13

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.oeis.a048.A048861;

/**
 * A344870 Number of distinct prime factors of n^n-1.
 * @author Georg Fischer
 */
public class A344870 extends Sequence2 {

  private final A048861 mSeq = new A048861();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(mSeq.next()).omega());
  }
}
