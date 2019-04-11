package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040453 Continued fraction for <code>sqrt(475)</code>.
 * @author Georg Fischer
 */
public class A040453 extends PrependSequence {

  /** Construct the sequence. */
  public A040453() {
    super(new PeriodicSequence(1, 3, 1, 6, 2, 6, 1, 3, 1, 42), Z.valueOf(21));
  }
}
