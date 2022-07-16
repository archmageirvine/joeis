package irvine.oeis.a271;
// manually cordrectab/cordrec at 2022-07-15 07:53

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000806;

/**
 * A271215 Number of loop-free assembly graphs with n rigid vertices.
 * @author Georg Fischer
 */
public class A271215 extends A271218 {

  private final Sequence mSeq = new A000806();

  @Override
  public Z next() {
    return mSeq.next().abs().add(super.next()).divide2();
  }
}
