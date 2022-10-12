package irvine.oeis.a059;

/**
 * A059823 Expansion of series related to Liouville's Last Theorem: g.f. sum_{t&gt;0} (-1)^(t+1) *x^(t*(t+1)/2) / ( (1-x^t)^6 *product_{i=1..t} (1-x^i) ).
 * @author Sean A. Irvine
 */
public class A059823 extends A059819 {

  /** Construct the sequence. */
  public A059823() {
    super(6);
  }
}
