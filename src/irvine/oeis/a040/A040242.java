package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040242 Continued fraction for <code>sqrt(259)</code>.
 * @author Georg Fischer
 */
public class A040242 extends PrependSequence {

  /** Construct the sequence. */
  public A040242() {
    super(new PeriodicSequence(10, 1, 2, 3, 4, 3, 2, 1, 10, 32), Z.valueOf(16));
  }
}
