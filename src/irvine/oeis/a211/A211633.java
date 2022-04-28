package irvine.oeis.a211;
// manually

import irvine.math.z.Z;

/**
 * A211633 Number of ordered triples (w,x,y) with all terms in {1,...,n} and w^2&gt;2x^2+2y^2.
 * @author Georg Fischer
 */
public class A211633 extends A211422 {

  /** Construct the sequence. */
  public A211633() {
    super(0, n -> new Long[] {1L, n}, (n, w, x, y) -> w * w > 2 * x * x + 2 * y * y);
  }

  @Override
  public Z next() {
    return super.next().multiply(8);
  }
}
