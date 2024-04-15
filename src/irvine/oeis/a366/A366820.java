package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a014.A014566;

/**
 * A366820 a(n) is the sum of the divisors of n^n + 1.
 * @author Sean A. Irvine
 */
public class A366820 extends Sequence0 {

  private final Sequence mSeq = new A014566();

  @Override
  public Z next() {
    return Functions.SIGMA.z(mSeq.next());
  }
}
