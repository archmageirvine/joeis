package irvine.oeis.a081;

import java.util.Iterator;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A081463.
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
    return new Z(v.reverse().toString());
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

/*
(PARI) {f(digit)=local(v, m, k, c, s); v=""; m=0; k=digit; c=0; while(m!=digit, v=concat(k, v); m=digit*k+c; s=divrem(m, 10); c=s[1]; k=s[2]); eval(v)}
 */
