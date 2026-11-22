package irvine.oeis.a351;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a003.A003239;

/**
 * A351364 Number of necklaces with n black and n white beads that avoid the pattern BBBB.
 * @author Gregory Morse
 */
public class A351364 extends A351363 {
  private final Sequence mAll = new A003239().skip();

  @Override
  public Z next() {
    return mAll.next().subtract(super.next());
  }
}
