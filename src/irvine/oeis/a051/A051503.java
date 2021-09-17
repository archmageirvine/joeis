package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051503 a(n) = min { n, floor(100/n) }.
 * @author Sean A. Irvine
 */
public class A051503 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Math.min(++mN, 100 / mN));
  }
}

