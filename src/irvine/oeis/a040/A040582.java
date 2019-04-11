package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040582 Continued fraction for <code>sqrt(607)</code>.
 * @author Georg Fischer
 */
public class A040582 extends PrependSequence {

  /** Construct the sequence. */
  public A040582() {
    super(new PeriodicSequence(1, 1, 1, 3, 7, 1, 15, 1, 1, 4, 1, 23, 1, 4, 1, 1, 15, 1, 7, 3, 1, 1, 1, 48), Z.valueOf(24));
  }
}
