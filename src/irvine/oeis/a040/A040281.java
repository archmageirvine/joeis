package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040281 Continued fraction for sqrt(299).
 * @author Georg Fischer
 */
public class A040281 extends PrependSequence {

  /** Construct the sequence. */
  public A040281() {
    super(new PeriodicSequence(3, 2, 3, 34), Z.valueOf(17));
  }
}
