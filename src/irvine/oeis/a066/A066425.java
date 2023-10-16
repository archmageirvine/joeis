package irvine.oeis.a066;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A066425 a(1) = 1; thereafter a(n) is the smallest number &gt; a(n-1) such that a(n) minus any sum of distinct earlier terms is not already in the sequence.
 * @author Sean A. Irvine
 */
public class A066425 extends MemorySequence {

  // After Charlie Neder

  {
    add(Z.ZERO);
    setOffset(1);
  }

  private boolean solve(final Z n, final Set<Z> arr, final boolean dupl) {
    final HashSet<Z> s = new HashSet<>();
    for (final Z i : toList()) {
      if (i.compareTo(n) <= 0 && i.compareTo(n.divide(dupl ? 2 : 3)) > 0) {
        s.add(i);
      }
    }
    if (s.contains(n)) {
      return true;
    }
    for (final Z i : s) {
      if (dupl && arr.contains(i)) {
        continue;
      }
      final boolean added = arr.add(i);
      if (solve(n.subtract(i), arr, !added || dupl)) {
        return true;
      }
      if (added) {
        arr.remove(i);
      }
    }
    return false;
  }

  @Override
  protected Z computeNext() {
    Z k = a(size() - 1).multiply2().add(1);
    while (solve(k, new HashSet<>(), false)) {
      k = k.add(1);
    }
    return k;
  }
}
