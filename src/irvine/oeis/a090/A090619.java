package irvine.oeis.a090;
// manually A054861/parm2 at 2022-01-08 16:17

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a054.A054861;

/**
 * A090619 Highest power of 12 dividing n!.
 * @author Georg Fischer
 */
public class A090619 extends A054861 {

  private Sequence mSeq = new A090616();

  @Override
  public Z next() {
    return super.next().min(mSeq.next());
  }
}
