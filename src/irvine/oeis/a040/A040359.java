package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040359 Continued fraction for <code>sqrt(379)</code>.
 * @author Georg Fischer
 */
public class A040359 extends PrependSequence {

  /** Construct the sequence. */
  public A040359() {
    super(new PeriodicSequence(2, 7, 3, 2, 2, 6, 12, 1, 4, 1, 1, 1, 3, 4, 19, 4, 3, 1, 1, 1, 4, 1, 12, 6, 2, 2, 3, 7, 2, 38), Z.valueOf(19));
  }
}
