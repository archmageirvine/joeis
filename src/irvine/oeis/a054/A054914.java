package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a003.A003027;
import irvine.oeis.a053.A053763;

/**
 * A054914 Number of labeled connected digraphs with n nodes such that complement is also connected.
 * @author Sean A. Irvine
 */
public class A054914 extends A003027 {

  private final Sequence mA = new A053763().skip(1);

  @Override
  public Z next() {
    return super.next().multiply2().subtract(mA.next());
  }
}
