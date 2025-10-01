package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a023.A023416;

/**
 * A080799 Number of divide by 2 and add 1 operations required to reach ...,7,8,4,2,1 when started at n.
 * @author Sean A. Irvine
 */
public class A080799 extends Sequence1 {

  private final Sequence mA = new A023416().skip(2);
  private long mN = 1;

  @Override
  public Z next() {
    return mA.next().add(Functions.DIGIT_LENGTH.l(2, ++mN) + 3);
  }
}
