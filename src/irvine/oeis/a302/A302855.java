package irvine.oeis.a302;
// manually 2023-01-13; dersimpln at 2021-08-25 22:45

import irvine.math.z.Z;
import irvine.oeis.a000.A000152;

/**
 * A302855 Expansion of ((1 + 2 * Sum_{k&gt;=1} q^(k^2))^16 - 1) / 32.
 * @author Georg Fischer
 */
public class A302855 extends A000152 {

  protected int mN;

  /** Construct the sequence. */
  public A302855() {
    setOffset(1);
    mN = 0;
    super.next();
  }

  @Override
  public Z next() {
    ++mN;
    return super.next().divide(32);
  }
}
