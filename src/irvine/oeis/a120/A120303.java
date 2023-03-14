package irvine.oeis.a120;
// manually knest/jaguar at 2023-03-12

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.oeis.a000.A000108;

/**
 * A120303 Largest prime factor of Catalan number A000108(n).
 * @author Georg Fischer
 */
public class A120303 extends Sequence2 {

  private final A000108 mSeq = new A000108();

  {
    mSeq.next();
    mSeq.next();
  }

  @Override
  public Z next() {
    return Jaguar.factor(mSeq.next()).largestPrimeFactor();
  }
}
