package irvine.oeis.a066;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a005.A005132;
import irvine.oeis.a063.A063733;

/**
 * A066201 Array read by antidiagonals upwards: for n-th row (n&gt;=0), T(n,0) = 1; for k &gt; 0, T(n,k) = T(n,k-1)-(n+k-1) if this is positive and has not already appeared in this row, otherwise T(n,k) = T(n,k-1)+(n+k-1).
 * @author Sean A. Irvine
 */
public class A066201 extends Sequence0 {

  private final ArrayList<Sequence> mA = new ArrayList<>();
  {
    mA.add(new A063733());
  }
  private int mM = 1;

  @Override
  public Z next() {
    if (--mM < 0) {
      mM = mA.size();
      mA.add(new A005132(1, 2 - mM, mM - 2));
    }
    return mA.get(mM).next();
  }
}
