package irvine.oeis.a302;
// manually 2023-01-13; dersimpln at 2021-08-25 22:45

import irvine.math.z.Z;

/**
 * A302857 Expansion of ((1 + 2 * Sum_{k&gt;=1} q^(k^2))^32 - 1) / 64.
 * @author Georg Fischer
 */
public class A302857 extends A302856 {

  /** Construct the sequence. */
  public A302857() {
    super.next();
  }

  @Override
  public int getOffset() {
    return 1;
  }

  @Override
  public Z next() {
    return super.next().divide(64);
  }
}
