package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122603 Expansion of x*(1-42*x+650*x^2-4477*x^3+12896*x^4-11417*x^5+2675*x^6+110*x^7) / ( 1-43*x+691*x^2-5146*x^3+17903*x^4-25954*x^5+11826*x^6-876*x^7+x^8 ).
 * @author Sean A. Irvine
 */
public class A122603 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122603() {
    super(1, new long[] {-1, 876, -11826, 25954, -17903, 5146, -691, 43}, new long[] {1, 1, 2, 64, 1509, 27589, 453949, 7116398});
  }
}
