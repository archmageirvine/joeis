package irvine.oeis.a146;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A146326 Length of the period of the continued fraction of (1+sqrt(n))/2.
 * @author Georg Fischer
 */
public class A146326 extends AbstractSequence implements DirectSequence {

  private long mN;

  /** Construct the sequence. */
  public A146326() {
    super(1);
    mN = 0;
  }

  private static int computePeriod(final long n) {
    final ArrayList<Long> partialQuotients = new ArrayList<>();
    final Map<String, Integer> seenStates = new LinkedHashMap<>();
    long p = 1;
    long q = 2;
    long d = n;
    final long sd = Functions.SQRT.l(d);
    if (sd * sd == d) {
      return 0; // not irrational
    }
    if ((d - p * p) % q != 0) { // adjust
      p = 2;
      q = 4;
      d = 4 * n;
    }
    while (true) {
      final String state = p + "," + q;
      if (seenStates.containsKey(state)) {
        return partialQuotients.size() - seenStates.get(state);
      }
      seenStates.put(state, partialQuotients.size());
      final long frac = (p + Functions.SQRT.l(d)) / q;
      partialQuotients.add(frac);
      p = frac * q - p;
      q = (d - p * p) / q;
    }
  }

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final long n) {
    return Z.valueOf(computePeriod(n));
  }

  @Override
  public Z a(final Z n) {
    return a(n.longValueExact());
  }
}
