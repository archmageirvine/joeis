package irvine.oeis.a054;
// manually dersimpln at 2021-09-27 18:28

import irvine.math.z.Z;
import irvine.oeis.a000.A000013;

/**
 * A054538 A000013 / 2.
 * @author Georg Fischer
 */
public class A054538 extends A000013 {

  protected int mN;

  /** Construct the sequence */
  public A054538() {
    super(1);
    mN = 0;
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    ++mN;
    return super.next().divide2();
  }
}
