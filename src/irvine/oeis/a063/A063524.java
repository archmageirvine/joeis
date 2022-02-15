package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A063524 Characteristic function of 1.
 * @author Georg Fischer
 */
public class A063524 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 1 ? Z.ONE : Z.ZERO;
  }
}
