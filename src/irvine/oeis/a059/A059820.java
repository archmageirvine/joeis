package irvine.oeis.a059;

/**
 * A059820 Expansion of series related to Liouville's Last Theorem: g.f. Sum_{t&gt;0} (-1)^(t+1) *x^(t*(t+1)/2) / ( (1-x^t)^3 *Product_{i=1..t} (1-x^i) ).
 * @author Sean A. Irvine
 */
public class A059820 extends A059819 {

  /** Construct the sequence. */
  public A059820() {
    super(3);
  }
}
