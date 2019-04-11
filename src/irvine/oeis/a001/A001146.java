package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001146 <code>a(n) = 2^(2^n)</code>.
 * @author Sean A. Irvine
 */
public class A001146 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(1 << ++mN);
  }
}
