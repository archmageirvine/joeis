package irvine.oeis.a079;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A036275 The periodic part of the decimal expansion of 1/n. Any initial 0's are to be placed at end of cycle.
 * @author Sean A. Irvine
 */
public class A079483 extends Sequence2 {

  private long mBase = 1;
  private List<Integer> mA = Collections.emptyList();
  private int mM = 0;

  private int getPeriod() {
    long pow = 0;
    Z powBase = Z.ONE;
    while (true) {
      ++pow;
      powBase = powBase.multiply(mBase);
      Z mb = powBase;
      for (long m = pow - 1; m >= 0; --m) {
        mb = mb.divide(mBase);
        if (powBase.subtract(mb).mod(7) == 0) {
          return Z.valueOf(pow - m).intValueExact();
        }
      }
    }
  }

  private List<Integer> step() {
    ++mBase;
    final List<Integer> a = new ArrayList<>();
    final List<Integer> b = new ArrayList<>();
    final int period = getPeriod();
    Q n = new Q(Z.ONE, Z.SEVEN);
    for (int k = 0; k < period; ++k) {
      n = n.multiply(mBase);
      a.add(n.toZ().intValue());
      n = n.subtract(a.get(k));
      if (n.isZero()) {
        return Collections.singletonList(0);
      }
    }
    for (int k = 0; k < a.size(); ++k) {
      n = n.multiply(mBase);
      b.add(n.toZ().intValue());
      n = n.subtract(b.get(k));
    }
    // Skip over any preperiod
    while (!a.equals(b)) {
      a.remove(0);
      a.add(b.get(0));
      b.remove(0);
      n = n.multiply(mBase);
      b.add(n.toZ().intValue());
      n = n.subtract(b.get(b.size() - 1));
    }
    return a;
  }

  @Override
  public Z next() {
    if (++mM >= mA.size()) {
      mA = step();
      mM = 0;
    }
    return Z.valueOf(mA.get(mM));
  }
}

