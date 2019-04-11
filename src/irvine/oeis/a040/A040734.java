package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040734 Continued fraction for <code>sqrt(762)</code>.
 * @author Georg Fischer
 */
public class A040734 extends PrependSequence {

  /** Construct the sequence. */
  public A040734() {
    super(new PeriodicSequence(1, 1, 1, 1, 8, 1, 1, 1, 1, 54), Z.valueOf(27));
  }
}
