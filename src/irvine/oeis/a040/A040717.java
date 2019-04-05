package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040717 Continued fraction for sqrt(745).
 * @author Georg Fischer
 */
public class A040717 extends PrependSequence {

  /** Construct the sequence. */
  public A040717() {
    super(new PeriodicSequence(3, 2, 1, 1, 5, 2, 10, 2, 5, 1, 1, 2, 3, 54), Z.valueOf(27));
  }
}
