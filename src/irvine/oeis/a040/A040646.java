package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040646 Continued fraction for <code>sqrt(672)</code>.
 * @author Georg Fischer
 */
public class A040646 extends PrependSequence {

  /** Construct the sequence. */
  public A040646() {
    super(new PeriodicSequence(1, 11, 1, 50), Z.valueOf(25));
  }
}
