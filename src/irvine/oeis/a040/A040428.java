package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040428 Continued fraction for <code>sqrt(450)</code>.
 * @author Georg Fischer
 */
public class A040428 extends PrependSequence {

  /** Construct the sequence. */
  public A040428() {
    super(new PeriodicSequence(4, 1, 2, 4, 2, 1, 4, 42), Z.valueOf(21));
  }
}
