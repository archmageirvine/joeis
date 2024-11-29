package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a002.A002808;

/**
 * A073451.
 * @author Sean A. Irvine
 */
public class A073459 extends A000040 {

  protected final Sequence mComposites = new A002808();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (true) {
      ++mM;
      if (super.next().compareTo(mComposites.next().multiply(mN)) > 0) {
        return Z.valueOf(mM);
      }
    }
  }
}
