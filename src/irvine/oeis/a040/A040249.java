package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040249 Continued fraction for <code>sqrt(266)</code>.
 * @author Georg Fischer
 */
public class A040249 extends PrependSequence {

  /** Construct the sequence. */
  public A040249() {
    super(new PeriodicSequence(3, 4, 3, 32), Z.valueOf(16));
  }
}
