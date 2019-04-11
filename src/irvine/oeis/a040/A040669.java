package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040669 Continued fraction for <code>sqrt(696)</code>.
 * @author Georg Fischer
 */
public class A040669 extends PrependSequence {

  /** Construct the sequence. */
  public A040669() {
    super(new PeriodicSequence(2, 1, 1, 1, 1, 1, 2, 52), Z.valueOf(26));
  }
}
