package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040188 Continued fraction for <code>sqrt(203)</code>.
 * @author Georg Fischer
 */
public class A040188 extends PrependSequence {

  /** Construct the sequence. */
  public A040188() {
    super(new PeriodicSequence(4, 28), Z.valueOf(14));
  }
}
