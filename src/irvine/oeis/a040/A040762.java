package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040762 Continued fraction for <code>sqrt(791)</code>.
 * @author Georg Fischer
 */
public class A040762 extends PrependSequence {

  /** Construct the sequence. */
  public A040762() {
    super(new PeriodicSequence(8, 56), Z.valueOf(28));
  }
}
