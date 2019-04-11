package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import java.util.ArrayList;

/**
 * A002493 Number of ways to arrange n non-attacking kings on <code>an n</code> X n board, with 2 sides identified to form a cylinder, with 1 in each row and column.
 * @author Sean A. Irvine
 */
public class A002493 implements Sequence {

  private final Sequence mA002464 = new A002464();
  private final ArrayList<Z> mB = new ArrayList<>();
  private int mN = -1;

  private Z b(final int n) {
    while (n >= mB.size()) {
      mB.add(mA002464.next());
    }
    return mB.get(n);
  }

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (int k = 0; k < mN; k += 2) {
      s = s.add(b(mN - k));
    }
    return Z.ZERO.max(b(mN + 1).subtract(s.multiply2()));
  }
}
