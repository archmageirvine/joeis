package irvine.oeis.a059;

/**
 * A059821 Expansion of series related to Liouville's Last Theorem: g.f. sum_{t&gt;0} (-1)^(t+1) *x^(t*(t+1)/2) / ( (1-x^t)^4 *product_{i=1..t} (1-x^i) ).
 * @author Sean A. Irvine
 */
public class A059821 extends A059819 {

  /** Construct the sequence. */
  public A059821() {
    super(4);
  }
}
