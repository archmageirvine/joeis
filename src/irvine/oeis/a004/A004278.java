package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004278 <code>1, 3</code> and the positive even numbers.
 * @author Sean A. Irvine
 */
public class A004278 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    mN += mN < 4 ? 1 : 2;
    return Z.valueOf(mN);
  }
}
