package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040594 Continued fraction for <code>sqrt(619)</code>.
 * @author Georg Fischer
 */
public class A040594 extends PrependSequence {

  /** Construct the sequence. */
  public A040594() {
    super(new PeriodicSequence(1, 7, 3, 5, 4, 1, 3, 1, 2, 1, 1, 9, 2, 1, 1, 1, 15, 1, 23, 1, 15, 1, 1, 1, 2, 9, 1, 1, 2, 1, 3, 1, 4, 5, 3, 7, 1, 48), Z.valueOf(24));
  }
}
