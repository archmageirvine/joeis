package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040727 Continued fraction for sqrt(755).
 * @author Georg Fischer
 */
public class A040727 extends PrependSequence {

  /** Construct the sequence. */
  public A040727() {
    super(new PeriodicSequence(2, 10, 2, 54), Z.valueOf(27));
  }
}
