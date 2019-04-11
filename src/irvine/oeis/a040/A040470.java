package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040470 Continued fraction for <code>sqrt(493)</code>.
 * @author Georg Fischer
 */
public class A040470 extends PrependSequence {

  /** Construct the sequence. */
  public A040470() {
    super(new PeriodicSequence(4, 1, 10, 3, 3, 10, 1, 4, 44), Z.valueOf(22));
  }
}
