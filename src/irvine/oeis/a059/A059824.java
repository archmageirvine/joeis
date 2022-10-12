package irvine.oeis.a059;

/**
 * A059824 Expansion of series related to Liouville's Last Theorem: g.f. Sum_{t&gt;=1} (-1)^(t+1) *x^(t*(t+1)/2) / ( (1-x^t)^7 * Product_{i=1..t} (1-x^i) ).
 * @author Sean A. Irvine
 */
public class A059824 extends A059819 {

  /** Construct the sequence. */
  public A059824() {
    super(7);
  }
}
