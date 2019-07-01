package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040099 Continued fraction for <code>sqrt(110)</code>.
 * @author Georg Fischer
 */
public class A040099 extends PrependSequence {

  /** Construct the sequence. */
  public A040099() {
    super(new PeriodicSequence(2, 20), Z.TEN);
  }
}
