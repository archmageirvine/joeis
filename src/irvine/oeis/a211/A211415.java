package irvine.oeis.a211;
// manually

/**
 * A211415 Number of ordered triples (w,x,y) with all terms in {-n,..., 0,...,n} and w^2 + x*y = 1.
 * @author Georg Fischer
 */
public class A211415 extends A211422 {

  /** Construct the sequence. */
  public A211415() {
    super(0, n -> new Long[] {-n, n}, (n, w, x, y) -> w * w + x * y == 1);
  }
}
