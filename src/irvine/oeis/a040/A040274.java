package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040274 Continued fraction for sqrt(292).
 * @author Georg Fischer
 */
public class A040274 extends PrependSequence {

  /** Construct the sequence. */
  public A040274() {
    super(new PeriodicSequence(11, 2, 1, 3, 8, 3, 1, 2, 11, 34), Z.valueOf(17));
  }
}
