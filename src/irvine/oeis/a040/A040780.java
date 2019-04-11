package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040780 Continued fraction for <code>sqrt(809)</code>.
 * @author Georg Fischer
 */
public class A040780 extends PrependSequence {

  /** Construct the sequence. */
  public A040780() {
    super(new PeriodicSequence(2, 3, 1, 7, 2, 1, 6, 2, 3, 11, 11, 3, 2, 6, 1, 2, 7, 1, 3, 2, 56), Z.valueOf(28));
  }
}
