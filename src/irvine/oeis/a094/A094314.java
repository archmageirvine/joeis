package irvine.oeis.a094;
// manually transpose at 2023-06-02 09:17

import irvine.math.z.Z;
import irvine.oeis.a058.A058087;
import irvine.oeis.triangle.Transpose;

/**
 * A094314 Triangle read by rows: T(n,k) = number of ways of seating n couples around a circular table so that exactly k married couples are adjacent (0 &lt;= k &lt;= n).
 * @author Georg Fischer
 */
public class A094314 extends Transpose {

  private int mN = -1;

  /** Construct the sequence. */
  public A094314() {
    super(new A058087());
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 1) {
      return super.next().add(1);
    }
    if (mN == 2) {
      return super.next().add(-1);
    }
    return super.next();
  }
}
