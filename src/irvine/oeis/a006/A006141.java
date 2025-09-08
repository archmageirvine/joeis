package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003106;
import irvine.oeis.a003.A003114;

/**
 * A006141 Number of integer partitions of n whose smallest part is equal to the number of parts.
 * @author Sean A. Irvine
 */
public class A006141 extends Sequence1 {

  private final Sequence mA = new A003114().skip();
  private final Sequence mOther = new A003106().skip();

  @Override
  public Z next() {
    return mA.next().subtract(mOther.next());
  }
}
