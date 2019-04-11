package irvine.oeis.a019;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019568 <code>a(n) =</code> smallest <code>k &gt;= 1</code> such that <code>{1^n, 2^n, 3^n, ..., k^n}</code> can be partitioned into two sets with equal sum.
 * @author Sean A. Irvine
 */
public class A019568 implements Sequence {

  private int mN = -1;

  private boolean search(final Z target, final int pos, final Z[] powers, final Z[] cum) {
    if (Z.ZERO.equals(target)) {
      return true;
    }
    if (pos < 0) {
      return false;
    }
    if (cum[pos].compareTo(target) < 0) {
      return false;
    }
    if (powers[pos].compareTo(target) <= 0 && search(target.subtract(powers[pos]), pos - 1, powers, cum)) {
      return true;
    }
    return search(target, pos - 1, powers, cum);
  }

  private boolean solvable(final ArrayList<Z> powers, final ArrayList<Z> cum) {
    final Z sum = cum.get(cum.size() - 1);
    return sum.isEven() && search(sum.divide2(), powers.size() - 1, powers.toArray(new Z[powers.size()]), cum.toArray(new Z[cum.size()]));
  }

  @Override
  public Z next() {
    ++mN;
    final ArrayList<Z> powers = new ArrayList<>();
    final ArrayList<Z> cum = new ArrayList<>();
    Z m = Z.ZERO;
    Z sum = Z.ZERO;
    do {
      m = m.add(1);
      final Z p = m.pow(mN);
      powers.add(p);
      sum = sum.add(p);
      cum.add(sum);
    } while (!solvable(powers, cum));
    return Z.valueOf(powers.size());
  }
}
