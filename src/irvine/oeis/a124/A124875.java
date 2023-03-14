package irvine.oeis.a124;
// manually knest/jaguar at 2023-03-12

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.oeis.a007.A007408;

/**
 * A124875 Greatest prime dividing A007408(n).
 * @author Georg Fischer
 */
public class A124875 extends Sequence2 {

  private final A007408 mSeq = new A007408();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return Jaguar.factor(mSeq.next()).largestPrimeFactor();
  }
}
