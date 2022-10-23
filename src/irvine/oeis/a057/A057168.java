package irvine.oeis.a057;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057168 Next larger integer with same binary weight (number of 1 bits) as n.
 * @author Sean A. Irvine
 */
public class A057168 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(LongUtils.swizzle(++mN));
  }
}

