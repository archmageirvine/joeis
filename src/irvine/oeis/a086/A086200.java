package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000625;

/**
 * A086200 Number of unrooted steric quartic trees with 2n (unlabeled) nodes and possessing a bicentroid; number of 2n-carbon alkanes C(2n)H(4n +2) with a bicentroid when stereoisomers are regarded as different.
 * @author Sean A. Irvine
 */
public class A086200 extends Sequence1 {

  private final Sequence mA = new A000625().skip(2);

  @Override
  public Z next() {
    return Functions.TRIANGULAR.z(mA.next());
  }
}
