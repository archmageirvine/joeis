package irvine.oeis.a120;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A120348 Number of labeled simply-rooted 2-trees with n labeled vertices <code>(i</code>.e., <code>n+2</code> vertices altogether; a simply-rooted 2-tree is an externally rooted 2-tree whose root edge belongs to exactly one triangle).
 * @author Sean A. Irvine
 */
public class A120348 implements Sequence {

  private int mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.multiply(5).multiply(5 * mN - 2).multiply(5 * mN - 3).multiply(5 * mN - 4).multiply(5 * mN - 6)
        .divide(8).divide(4 * mN - 1).divide(4 * mN - 3).divide(2 * mN - 1);
    }
    return mA;
  }
}

