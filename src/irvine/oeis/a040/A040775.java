package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040775 Continued fraction for <code>sqrt(804)</code>.
 * @author Georg Fischer
 */
public class A040775 extends PrependSequence {

  /** Construct the sequence. */
  public A040775() {
    super(new PeriodicSequence(2, 1, 4, 2, 18, 2, 4, 1, 2, 56), Z.valueOf(28));
  }
}
