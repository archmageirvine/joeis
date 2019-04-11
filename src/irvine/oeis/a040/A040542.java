package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040542 Continued fraction for <code>sqrt(566)</code>.
 * @author Georg Fischer
 */
public class A040542 extends PrependSequence {

  /** Construct the sequence. */
  public A040542() {
    super(new PeriodicSequence(1, 3, 1, 3, 1, 1, 8, 1, 22, 1, 8, 1, 1, 3, 1, 3, 1, 46), Z.valueOf(23));
  }
}
