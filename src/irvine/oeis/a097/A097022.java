package irvine.oeis.a097;
// manually sigman1/sigma1 at 2023-03-12

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001105;

/**
 * A097022 a(n) = (sigma(2n^2)-3)/6.
 * @author Georg Fischer
 */
public class A097022 extends Sequence1 {

  private final A001105 mSeq = new A001105();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return Functions.SIGMA.z(mSeq.next()).subtract(3).divide(6);
  }
}
