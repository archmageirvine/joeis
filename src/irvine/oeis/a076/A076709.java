package irvine.oeis.a076;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;
import irvine.oeis.a056.A056472;

/**
 * A076709 Factors in factorizations of composite numbers into at least 2 factors &gt; 1.
 * @author Sean A. Irvine
 */
public class A076709 extends A002808 {

  private final List<Long> mA = new ArrayList<>();
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mA.size()) {
      mA.clear();
      for (final List<Long> lst : A056472.factor(super.next().longValueExact(), 2)) {
        mA.addAll(lst);
      }
      mM = 1; // skip n = n factorization
    }
    return Z.valueOf(mA.get(mM));
  }
}
