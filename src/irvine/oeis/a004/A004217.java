package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004217 <code>(n^n)^(n^n)</code>.
 * @author Sean A. Irvine
 */
public class A004217 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z n2 = Z.valueOf(mN).pow(mN);
    return n2.pow(n2.intValueExact());
  }
}
