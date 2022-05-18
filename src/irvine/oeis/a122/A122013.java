package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122013 Expansion of g.f. -x*(5*x^7-20*x^6-2*x^5+54*x^4+7*x^3-20*x^2-8*x-1)/((x^4-x^3-3*x^2+x+1)*(x^4+x^3-3*x^2-x+1)).
 * @author Sean A. Irvine
 */
public class A122013 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122013() {
    super(new long[] {-1, 0, 7, 0, -13, 0, 7, 0}, new long[] {1, 8, 27, 49, 122, 241, 530, 1101});
  }
}
