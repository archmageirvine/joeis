package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040811 Continued fraction for <code>sqrt(840)</code>.
 * @author Georg Fischer
 */
public class A040811 extends PrependSequence {

  /** Construct the sequence. */
  public A040811() {
    super(new PeriodicSequence(1, 56), Z.valueOf(28));
  }
}
