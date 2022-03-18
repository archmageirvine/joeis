package irvine.oeis.a091;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000254;

/**
 * A091828 a(n)=n-2*valuation(A000254(n),3).
 * @author Georg Fischer
 */
public class A091828 extends A000254 {

  private int mN;

  /** Construct the sequence. */
  public A091828() {
    mN = 0;
    super.next();
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN - 2 * ZUtils.valuation(Z.THREE, super.next()));
  }
}
