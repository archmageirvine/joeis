package irvine.oeis.a069;

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.FilterSequence;
import irvine.oeis.a018.A018252;

/**
 * A069155 Nonprime numbers n such that (n+1)*Sum_{d|n} 1/(d+1) is an integer.
 * @author Sean A. Irvine
 */
public class A069155 extends FilterSequence {

  /** Construct the sequence. */
  public A069155() {
    super(1, new A018252(), k -> Rationals.SINGLETON.sumdiv(k.intValueExact(), d -> new Q(1, d + 1)).multiply(k.add(1)).isInteger());
  }
}

