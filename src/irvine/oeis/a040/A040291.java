package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040291 Continued fraction for <code>sqrt(309)</code>.
 * @author Georg Fischer
 */
public class A040291 extends PrependSequence {

  /** Construct the sequence. */
  public A040291() {
    super(new PeriodicSequence(1, 1, 2, 1, 2, 4, 1, 1, 1, 8, 6, 1, 10, 1, 6, 8, 1, 1, 1, 4, 2, 1, 2, 1, 1, 34), Z.valueOf(17));
  }
}
