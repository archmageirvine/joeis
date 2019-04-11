package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040367 Continued fraction for <code>sqrt(387)</code>.
 * @author Georg Fischer
 */
public class A040367 extends PrependSequence {

  /** Construct the sequence. */
  public A040367() {
    super(new PeriodicSequence(1, 2, 19, 2, 1, 38), Z.valueOf(19));
  }
}
