package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040425 Continued fraction for <code>sqrt(447)</code>.
 * @author Georg Fischer
 */
public class A040425 extends PrependSequence {

  /** Construct the sequence. */
  public A040425() {
    super(new PeriodicSequence(7, 42), Z.valueOf(21));
  }
}
