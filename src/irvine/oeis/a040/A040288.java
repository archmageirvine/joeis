package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040288 Continued fraction for <code>sqrt(306)</code>.
 * @author Georg Fischer
 */
public class A040288 extends PrependSequence {

  /** Construct the sequence. */
  public A040288() {
    super(new PeriodicSequence(2, 34), Z.valueOf(17));
  }
}
