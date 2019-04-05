package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040705 Continued fraction for sqrt(733).
 * @author Georg Fischer
 */
public class A040705 extends PrependSequence {

  /** Construct the sequence. */
  public A040705() {
    super(new PeriodicSequence(13, 1, 1, 13, 54), Z.valueOf(27));
  }
}
