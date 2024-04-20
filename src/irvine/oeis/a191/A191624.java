package irvine.oeis.a191;
// manually knest/jaguar at 2023-03-13

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A191624 Largest prime factor of n^n - n^(n-1) - n^(n-2) - ... - n^2 - n - 1.
 * @author Georg Fischer
 */
public class A191624 extends Sequence3 {

  private final A191690 mSeq = new A191690();

  {
    mSeq.next();
    mSeq.next();
  }

  @Override
  public Z next() {
    return Functions.GPF.z(mSeq.next());
  }
}
