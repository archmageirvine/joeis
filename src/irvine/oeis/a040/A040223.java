package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040223 Continued fraction for <code>sqrt(239)</code>.
 * @author Georg Fischer
 */
public class A040223 extends PrependSequence {

  /** Construct the sequence. */
  public A040223() {
    super(new PeriodicSequence(2, 5, 1, 2, 4, 15, 4, 2, 1, 5, 2, 30), Z.valueOf(15));
  }
}
