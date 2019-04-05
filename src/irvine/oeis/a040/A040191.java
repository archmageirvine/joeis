package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040191 Continued fraction for sqrt(206).
 * @author Georg Fischer
 */
public class A040191 extends PrependSequence {

  /** Construct the sequence. */
  public A040191() {
    super(new PeriodicSequence(2, 1, 5, 14, 5, 1, 2, 28), Z.valueOf(14));
  }
}
