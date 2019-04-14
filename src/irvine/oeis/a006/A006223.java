package irvine.oeis.a006;

import irvine.math.polynomial.Polynomial;
import irvine.oeis.RatPolyGfSequence;

/**
 * A006223 Number of binary rooted trees of height n requiring 3 registers.
 * @author Sean A. Irvine
 */
public class A006223 extends RatPolyGfSequence {

  /** Construct the sequence. */
  public A006223() {
    super(RING.one(), Polynomial.create(1, -14, 78, -220, 330, -252, 84, -8));
  }
}
