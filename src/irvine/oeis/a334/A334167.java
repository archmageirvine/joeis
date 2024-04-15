package irvine.oeis.a334;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a048.A048861;

/**
 * A334167 a(n) is the number of divisors of n^n-1.
 * @author Georg Fischer
 */
public class A334167 extends Sequence2 {

  private final Sequence mSeq = new A048861().skip();

  @Override
  public Z next() {
    return Functions.SIGMA0.z(mSeq.next());
  }
}
