package irvine.oeis.a056;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056472 Triangle read by rows in which row n lists all factorizations of n.
 * @author Sean A. Irvine
 */
public class A056472 extends Sequence1 {

  private final List<Long> mA = new ArrayList<>();
  private int mN = 0;
  private int mM = 0;

  private List<List<Long>> factor(final long n, final long min) {
    final ArrayList<List<Long>> lst = new ArrayList<>();
    lst.add(Collections.singletonList(n));
    for (final Z dd : Jaguar.factor(n).divisorsSorted()) {
      final long d = dd.longValue();
      if (d >= min && d <= LongUtils.sqrt(n)) {
        for (final List<Long> t : factor(n / d, d)) {
          final ArrayList<Long> u = new ArrayList<>();
          u.add(d);
          u.addAll(t);
          lst.add(u);
        }
      }
    }
    return lst;
  }

  @Override
  public Z next() {
    if (++mM >= mA.size()) {
      mA.clear();
      for (final List<Long> lst : factor(++mN, 2)) {
        mA.addAll(lst);
      }
      mM = 0;
    }
    return Z.valueOf(mA.get(mM));
  }
}
