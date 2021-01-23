package irvine.oeis.a036;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;
import irvine.util.string.Roman;

/**
 * A036743 Numbers &lt;= 3999 sorted in Roman numeral reverse lexicographic order.
 * @author Sean A. Irvine
 */
public class A036743 extends FiniteSequence {

  private static Collection<Z> build() {
    final TreeMap<String, Z> map = new TreeMap<>();
    for (int k = 1; k <= 3999; ++k) {
      map.put(Roman.roman(k), Z.valueOf(k));
    }
    final List<Z> res = new ArrayList<>(map.values());
    Collections.reverse(res);
    return res;
  }

  /** Construct the sequence. */
  public A036743() {
    super(build());
  }
}
