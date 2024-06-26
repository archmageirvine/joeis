package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a048.A048861;

/**
 * A366819 a(n) is the sum of the divisors of n^n-1.
 * @author Sean A. Irvine
 */
public class A366819 extends Sequence2 {

  private final Sequence mSeq = new A048861().skip();

  @Override
  public Z next() {
    return Functions.SIGMA1.z(mSeq.next());
  }
}
