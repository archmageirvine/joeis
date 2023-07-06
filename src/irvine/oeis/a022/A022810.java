package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000204;
import irvine.oeis.a090.A090946;

/**
 * A022810 a(n) = L(n+2) + c(n) where L(k) is the k-th Lucas number and c(n) is the n-th number that is 1 or 3 or is not a Lucas number.
 * @author Sean A. Irvine
 */
public class A022810 extends Sequence1 {

  private final Sequence mA = new A000204().skip(2);
  private final Sequence mB = new PrependSequence(new A090946().skip(2), 1, 2, 3);

  @Override
  public Z next() {
    return mA.next().add(mB.next());
  }
}
