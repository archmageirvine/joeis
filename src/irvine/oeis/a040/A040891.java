package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040891 Continued fraction for sqrt(922).
 * @author Georg Fischer
 */
public class A040891 extends PrependSequence {

  /** Construct the sequence. */
  public A040891() {
    super(new PeriodicSequence(2, 1, 2, 1, 9, 2, 1, 1, 6, 6, 1, 1, 2, 9, 1, 2, 1, 2, 60), Z.valueOf(30));
  }
}
