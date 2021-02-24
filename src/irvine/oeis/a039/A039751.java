package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000088;
import irvine.oeis.a006.A006786;

/**
 * A039751 Number of n-node graphs containing a 4-cycle.
 * @author Sean A. Irvine
 */
public class A039751 extends A000088 {

  private final Sequence mSquareFree = new PrependSequence(new A006786(), 1);

  @Override
  public Z next() {
    return super.next().subtract(mSquareFree.next());
  }
}
