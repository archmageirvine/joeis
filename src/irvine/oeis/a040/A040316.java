package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040316 Continued fraction for <code>sqrt(335)</code>.
 * @author Georg Fischer
 */
public class A040316 extends PrependSequence {

  /** Construct the sequence. */
  public A040316() {
    super(new PeriodicSequence(3, 3, 3, 36), Z.valueOf(18));
  }
}
