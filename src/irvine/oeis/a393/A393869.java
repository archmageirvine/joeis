package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003557;
import irvine.oeis.a053.A053669;

/**
 * A393869 Numbers k such that A053669(k) &lt; A003557(k).
 * @author Sean A. Irvine
 */
public class A393869 extends Sequence1 {

  private long mN = 0;
  private final Sequence mA = new A053669();
  private final Sequence mB = new A003557();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mA.next().compareTo(mB.next()) < 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
