package irvine.oeis.a035;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A035479 (-1)sigma sequence: a(n)=(-1)sigma(a(n-1)), where if x=Product p(i)^r(i), then (-1)sigma(x)=Product(-1+(Sum p(i)^s(i), s(i)=1 to r(i))).
 * @author Sean A. Irvine
 */
public class A035479 extends PrependSequence {

  /** Construct the sequence. */
  public A035479() {
    super(new PeriodicSequence(780, 480, 488), 624, 696, 728, 936, 1716, 1200, 1682, 869);
  }
}

