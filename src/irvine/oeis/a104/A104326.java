package irvine.oeis.a104;
// manually knest at 2023-03-12

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a003.A003754;

/**
 * A104326 Dual Zeckendorf representation of n or the maximal (binary) Fibonacci representation. Also list of binary vectors not containing 00.
 * @author Georg Fischer
 */
public class A104326 extends Sequence0 {

  private final A003754 mSeq = new A003754();

  @Override
  public Z next() {
    return new Z(mSeq.next().toString(2));
  }
}
