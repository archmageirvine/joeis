package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040402 Continued fraction for sqrt(423).
 * @author Georg Fischer
 */
public class A040402 extends PrependSequence {

  /** Construct the sequence. */
  public A040402() {
    super(new PeriodicSequence(1, 1, 3, 4, 3, 1, 1, 40), Z.valueOf(20));
  }
}
