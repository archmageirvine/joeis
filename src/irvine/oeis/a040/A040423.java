package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040423 Continued fraction for sqrt(445).
 * @author Georg Fischer
 */
public class A040423 extends PrependSequence {

  /** Construct the sequence. */
  public A040423() {
    super(new PeriodicSequence(10, 1, 1, 10, 42), Z.valueOf(21));
  }
}
