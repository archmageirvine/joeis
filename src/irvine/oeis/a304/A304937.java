package irvine.oeis.a304;

import irvine.math.z.Z;

/**
 * A304937 Number of unlabeled nonempty hypertrees with up to n vertices and no singleton edges.
 * @author Georg Fischer
 */
public class A304937 extends A304970 {

  private int mN = -1;

  @Override
  public Z next() {
    final Z result = super.next().subtract(1);
    return (++mN == 0) ? Z.ONE : result;
  }
}
