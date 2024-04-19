package irvine.math.polynomial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * Implements the <code>N</code> function in Read.
 * @author Sean A. Irvine
 */
public final class CycleIndexReadBigN {

  private CycleIndexReadBigN() { }

  private static Z fix(final MultivariateMonomial m) {
    Z fix = Z.ONE;
    for (final Map.Entry<Pair<String, Integer>, Z> e : m.entrySet()) {
      final int d = e.getKey().right();
      final Z j = e.getValue();
      fix = fix.multiply(Functions.FACTORIAL.z(j)).multiply(Z.valueOf(d).pow(j));
    }
    return fix;
  }

  private static String key(final MultivariateMonomial mm) {
    final TreeSet<Map.Entry<Pair<String, Integer>, Z>> sorter = new TreeSet<>((a, b) -> {
      final int c0 = a.getValue().compareTo(b.getValue());
      if (c0 != 0) {
        return c0;
      }
      final Pair<String, Integer> ak = a.getKey();
      final Pair<String, Integer> bk = b.getKey();
      final int c1 = ak.right().compareTo(bk.right());
      if (c1 != 0) {
        return c1;
      }
      return ak.left().compareTo(bk.left());
    });
    sorter.addAll(mm.entrySet());
    return sorter.toString();
  }

  private static HashMap<String, Q> toTermMap(final CycleIndex p) {
    final HashMap<String, Q> terms = new HashMap<>(p.size());
    for (final MultivariateMonomial m : p.values()) {
      terms.put(key(m), m.getCoefficient());
    }
    return terms;
  }

  /**
   * Compute Read's <code>N</code> function on the star of the supplied cycle indices.
   * @param p cycle indices
   * @return <code>N(p)</code>
   */
  public static Q bigN(final CycleIndex... p) {
    // The native cycle index format is pretty inefficient for this function, so we
    // do an upfront conversion to another format that makes for quicker pairing.
    final ArrayList<HashMap<String, Q>> termsList = new ArrayList<>(p.length - 1);
    for (int k = 1; k < p.length; ++k) {
      termsList.add(toTermMap(p[k]));
    }
    Q sum = Q.ZERO;
    for (final MultivariateMonomial m : p[0].values()) {
      final String key = key(m);
      Q c = m.getCoefficient();
      for (final HashMap<String, Q> t : termsList) {
        final Q v = t.get(key);
        if (v != null) {
          c = c.multiply(v);
        } else {
          c = Q.ZERO;
          break;
        }
      }
      if (!c.isZero()) {
        final Z fix = fix(m);
        sum = sum.add(c.multiply(fix.pow(p.length - 1)));
      }
    }
    return sum;
  }


}
