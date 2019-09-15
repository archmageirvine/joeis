package irvine.oeis.a008;

import irvine.oeis.LinearRecurrence;

/**
 * A008647 G.f.: <code>(1+x^9)/((1-x^4)*(1-x^6)) = ( 1+x^6-x^3 ) / ( (1+x)*(1+x+x^2)*(x^2+1)*(x-1)^2 )</code>.
 * @author Sean A. Irvine
 */
public class A008647 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008647() {
    super(new long[] {-1, 0, 0, 1, 1, 0, 0}, new long[] {1, 0, 0, 0, 1, 0, 1});
  }
}

