package irvine.oeis.a091;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000254;

/**
 * A091828 a(n)=n-2*valuation(A000254(n),3).
 * @author Georg Fischer
 */
public class A091828 extends A000254 {

  private int mN;

  /** Construct the sequence. */
  public A091828() {
    super(1);
    mN = 0;
    super.next();
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN - 2L * Functions.VALUATION.i(super.next(), Z.THREE));
  }
}
