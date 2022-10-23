package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051503 a(n) = min { n, floor(100/n) }.
 * @author Sean A. Irvine
 */
public class A051503 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Math.min(++mN, 100 / mN));
  }
}

