package irvine.oeis.a082;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000230;

/**
 * A082892 Floor(q(j)), where q(j) = 2j/log(A000230(j)); log is natural logarithm, 2j-s are prime gaps &gt; 1, A000230(j) is the minimal lesser prime opening the consecutive prime distance equals 2j.
 * @author Sean A. Irvine
 */
public class A082892 extends Sequence1 {

  private final Sequence mA = new A000230().skip();
  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    return CR.valueOf(mN).divide(CR.valueOf(mA.next()).log()).floor();
  }
}
