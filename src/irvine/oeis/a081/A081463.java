package irvine.oeis.a081;

import java.util.Iterator;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A081463 Numbers which when multiplied by their final digit have products with same digital sequence except that last is first. Numbers obtained by concatenating a term any number of times with itself also have the defining property and are omitted.
 * @author Sean A. Irvine
 */
public class A081463 implements Sequence {

  private Z f(final long digit) {
    final StringBuilder v = new StringBuilder();
    long m = 0;
    long k = digit;
    long c = 0;
    while (m != digit) {
      v.append(k);
      m = digit * k + c;
      c = m / 10;
      k = m % 10;
    }
    return new Z(v.reverse());
  }

  private final Iterator<Z> mIt;
  {
    final TreeSet<Z> soln = new TreeSet<>();
    for (long d = 1; d <= 9; d++) {
      soln.add(f(d));
    }
    mIt = soln.iterator();
  }

  @Override
  public Z next() {
    if (mIt.hasNext()) {
      return mIt.next();
    }
    return null;
  }
}
