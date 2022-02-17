package irvine.oeis.a054;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054657 Number of leaves on the rooted tree of height n constructed by the following rule. Assign weight 1 to the single node at height 1. At each node of weight w at height k&gt;0, branch to nodes at height k+1 as follows: one node of weight 1 and a node of weight d+1 if d divides w.
 * @author Sean A. Irvine
 */
public class A054657 implements Sequence {

  // It is only necessary to keep track of the number of nodes with a particular weight.

  private Map<Z, Z> mTree = null;

  private void add(final TreeMap<Z, Z> t, final Z key, final Z value) {
    final Z v = t.get(key);
    t.put(key, v == null ? value : v.add(value));
  }

  @Override
  public Z next() {
    if (mTree == null) {
      mTree = Collections.singletonMap(Z.ONE, Z.ONE);
    } else {
      final TreeMap<Z, Z> t = new TreeMap<>();
      for (final Map.Entry<Z, Z> e : mTree.entrySet()) {
        final Z m = e.getValue();
        add(t, Z.ONE, m);
        for (final Z d : Cheetah.factor(e.getKey()).divisors()) {
          add(t, d.add(1), m);
        }
      }
      mTree = t;
    }
    Z res = Z.ZERO;
    for (final Z multiplicity : mTree.values()) {
      res = res.add(multiplicity);
    }
    return res;
  }
}

