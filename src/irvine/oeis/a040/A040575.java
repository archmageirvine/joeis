package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040575 Continued fraction for <code>sqrt(600)</code>.
 * @author Georg Fischer
 */
public class A040575 extends PrependSequence {

  /** Construct the sequence. */
  public A040575() {
    super(new PeriodicSequence(2, 48), Z.valueOf(24));
  }
}
