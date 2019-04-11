package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040301 Continued fraction for <code>sqrt(319)</code>.
 * @author Georg Fischer
 */
public class A040301 extends PrependSequence {

  /** Construct the sequence. */
  public A040301() {
    super(new PeriodicSequence(1, 6, 5, 1, 4, 3, 1, 3, 4, 1, 5, 6, 1, 34), Z.valueOf(17));
  }
}
