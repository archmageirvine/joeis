package irvine.oeis.a035;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A035479 (-1)sigma sequence: a(n) = (-1)sigma(a(n-1)), where if (-1)sigma(k) = A049060(k) and a(1) = 624.
 * @author Sean A. Irvine
 */
public class A035479 extends PrependSequence {

  /** Construct the sequence. */
  public A035479() {
    super(1, new PeriodicSequence(780, 480, 488), 624, 696, 728, 936, 1716, 1200, 1682, 869);
  }
}

