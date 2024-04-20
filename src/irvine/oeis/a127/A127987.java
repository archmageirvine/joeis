package irvine.oeis.a127;
// manually knest/jaguar at 2023-03-13

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A127987 Largest prime factor of n! + 2^n - 1.
 * @author Georg Fischer
 */
public class A127987 extends Sequence1 {

  private final A127986 mSeq = new A127986();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return Functions.GPF.z(mSeq.next());
  }
}
