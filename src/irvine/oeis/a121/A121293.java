package irvine.oeis.a121;

import irvine.math.z.BellNumbers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A121293 a(n) = Bell(3*n+2).
 * @author Georg Fischer
 */
public class A121293 implements Sequence {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return BellNumbers.bell(3 * mN + 2);
  }
}
