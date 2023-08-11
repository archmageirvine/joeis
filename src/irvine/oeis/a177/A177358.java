package irvine.oeis.a177;
// manually robots/lingf at 2023-08-09 22:01

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A177358 G.f. = (1+10*x-12*x^2-50*x^3+10*x^4+10*x^5-12*x^6)/(1-8*x-66*x^2+280*x^3+178*x^4-532*x^5-84*x^6+108*x^7).
 * @author Georg Fischer
 */
public class A177358 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A177358() {
    super(1, "[0,-108,84,532,-178,-280,66,8,-1]", "1,18,198,2442,27396,322238,3676684", 0);
  }
}
