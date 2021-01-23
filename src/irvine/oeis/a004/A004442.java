package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004442 Natural numbers, pairs reversed: a(n) = n + (-1)^n; also Nimsum n + 1.
 * @author Sean A. Irvine
 */
public class A004442 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN ^ 1);
  }
}

