package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040778 Continued fraction for <code>sqrt(807)</code>.
 * @author Georg Fischer
 */
public class A040778 extends PrependSequence {

  /** Construct the sequence. */
  public A040778() {
    super(new PeriodicSequence(2, 2, 4, 1, 3, 4, 9, 4, 3, 1, 4, 2, 2, 56), Z.valueOf(28));
  }
}
