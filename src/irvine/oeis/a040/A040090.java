package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040090 Continued fraction for <code>sqrt(101)</code>.
 * @author Georg Fischer
 */
public class A040090 extends PrependSequence {

  /** Construct the sequence. */
  public A040090() {
    super(new PeriodicSequence(20), Z.TEN);
  }
}
