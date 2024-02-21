package irvine.oeis.a068;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A068142 a(0) = 21; for n &gt; 0, a(n) is the smallest triangular number which is a (proper) multiple of a(n-1).
 * @author Sean A. Irvine
 */
public class A068142 extends Sequence0 {

  private final Z mStart;
  private Z mA = null;

  protected A068142(final long start) {
    mStart = Z.valueOf(start);
  }

  /** Construct the sequence. */
  public A068142() {
    this(21);
  }

  private List<Z> pm(final List<Z> lst) {
    if (lst.size() == 1) {
      return Arrays.asList(Z.ONE, lst.get(0).subtract(1));
    }
    final Z a = lst.get(0);
    final List<Z> rest = lst.subList(1, lst.size());
    final Z m = ZUtils.product(rest);
    final List<Z> v = pm(rest);
    final List<Z> res = new ArrayList<>();
    final Z[] mods = {a, m};
    for (final Z t : v) {
      res.add(ZUtils.chineseRemainderTheorem(new Z[] {Z.ONE, t}, mods));
      res.add(ZUtils.chineseRemainderTheorem(new Z[] {Z.NEG_ONE, t}, mods));
    }
    Collections.sort(res);
    return res;
  }

  private List<Z> adjust(final List<Z> lst) {
    final List<Z> res = new ArrayList<>();
    for (final Z v : lst) {
      res.add(v.square().subtract(1).divide(8));
    }
    return res;
  }

  private Z nextTri(final Z n) {
    if (Z.ONE.equals(n)) {
      return Z.THREE;
    }
    final List<Z> lst = new ArrayList<>();
    final FactorSequence fs = Jaguar.factor(n.multiply(4));
    for (final Z p : fs.toZArray()) {
      lst.add(p.pow(fs.getExponent(p)));
    }
    for (final Z v : adjust(pm(lst))) {
      if (v.compareTo(n) > 0) {
        return v;
      }
    }
    throw new RuntimeException();
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = mStart;
    } else {
      mA = nextTri(mA);
    }
    return mA;
  }
}
