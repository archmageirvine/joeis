package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000204;
import irvine.oeis.a090.A090946;

/**
 * A022802 a(n) = L(n+1) + c(n) where L(k) = k-th Lucas number and c(n) is n-th number that is 1 or not a Lucas number.
 * @author Sean A. Irvine
 */
public class A022802 extends Sequence1 {

  private final Sequence mA = new A000204().skip(1);
  private final Sequence mB = new PrependSequence(new A090946().skip(1), 1);

  @Override
  public Z next() {
    return mA.next().add(mB.next());
  }
}
