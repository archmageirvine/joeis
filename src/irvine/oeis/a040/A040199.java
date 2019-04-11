package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040199 Continued fraction for <code>sqrt(214)</code>.
 * @author Georg Fischer
 */
public class A040199 extends PrependSequence {

  /** Construct the sequence. */
  public A040199() {
    super(new PeriodicSequence(1, 1, 1, 2, 3, 1, 4, 9, 1, 1, 5, 3, 14, 3, 5, 1, 1, 9, 4, 1, 3, 2, 1, 1, 1, 28), Z.valueOf(14));
  }
}
