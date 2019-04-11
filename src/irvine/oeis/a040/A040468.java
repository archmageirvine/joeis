package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040468 Continued fraction for <code>sqrt(491)</code>.
 * @author Georg Fischer
 */
public class A040468 extends PrependSequence {

  /** Construct the sequence. */
  public A040468() {
    super(new PeriodicSequence(6, 3, 4, 8, 1, 1, 1, 2, 1, 1, 21, 1, 1, 2, 1, 1, 1, 8, 4, 3, 6, 44), Z.valueOf(22));
  }
}
