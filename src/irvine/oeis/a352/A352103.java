package irvine.oeis.a352;
// manually knest at 2023-03-13

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a003.A003796;

/**
 * A352103 a(n) is the maximal (or lazy) tribonacci representation of n using a binary system of vectors not containing three consecutive 0's.
 * @author Georg Fischer
 */
public class A352103 extends Sequence0 {

  private final A003796 mSeq = new A003796();

  @Override
  public Z next() {
    return new Z(mSeq.next().toString(2));
  }
}
