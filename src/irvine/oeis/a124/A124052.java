package irvine.oeis.a124;
// manually sigman1/sigma1s at 2023-03-12

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003418;

/**
 * A124052 a(n) = sigma(lcm(1,2,...,n)) = A000203(A003418(n)).
 * @author Georg Fischer
 */
public class A124052 extends Sequence1 {

  private final A003418 mSeq = new A003418();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return Functions.SIGMA1.z(mSeq.next());
  }
}
