package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a392.A392806;

/**
 * A393079 First column of A392806.
 * @author Sean A. Irvine
 */
public class A393079 extends Sequence0 {

  private final A392806 mS = new A392806();
  private long mN = -1;

  @Override
  public Z next() {
    return mS.t(++mN, 2);
  }
}
