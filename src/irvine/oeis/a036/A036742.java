package irvine.oeis.a036;

import java.util.Collection;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;
import irvine.util.string.Roman;

/**
 * A036742 Numbers &lt;= 3999 sorted in Roman numeral lexicographic order.
 * @author Sean A. Irvine
 */
public class A036742 extends FiniteSequence {
  
  private static Collection<Z> build() {
    final TreeMap<String, Z> map = new TreeMap<>();
    for (int k = 1; k <= 3999; ++k) {
      map.put(Roman.roman(k), Z.valueOf(k));
    }
    return map.values();
  }

  /** Construct the sequence. */
  public A036742() {
    super(build());
  }
}
