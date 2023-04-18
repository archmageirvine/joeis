package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;

/**
 * A063082 Squares arising in A063076.
 * @author Sean A. Irvine
 */
public class A063082 extends FilterSequence {

  /** Construct the sequence. */
  public A063082() {
    super(new A063076(), Z::isSquare);
  }
}
