package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040495 Continued fraction for <code>sqrt(518)</code>.
 * @author Georg Fischer
 */
public class A040495 extends PrependSequence {

  /** Construct the sequence. */
  public A040495() {
    super(new PeriodicSequence(1, 3, 6, 3, 1, 44), Z.valueOf(22));
  }
}
