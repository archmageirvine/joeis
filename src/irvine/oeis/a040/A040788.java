package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040788 Continued fraction for <code>sqrt(817)</code>.
 * @author Georg Fischer
 */
public class A040788 extends PrependSequence {

  /** Construct the sequence. */
  public A040788() {
    super(new PeriodicSequence(1, 1, 2, 1, 1, 56), Z.valueOf(28));
  }
}
