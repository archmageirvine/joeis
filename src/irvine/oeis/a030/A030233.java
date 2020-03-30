package irvine.oeis.a030;

import irvine.math.Polyomino;

/**
 * A030233 Number of <code>n-celled one-sided</code> polyplets.
 * @author Sean A. Irvine
 */
public class A030233 extends A030222 {

  @Override
  protected Polyomino canon(final Polyomino p) {
    return p.oneSidedCanonical();
  }
}
