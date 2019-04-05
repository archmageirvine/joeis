package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040909 Continued fraction for sqrt(940).
 * @author Georg Fischer
 */
public class A040909 extends PrependSequence {

  /** Construct the sequence. */
  public A040909() {
    super(new PeriodicSequence(1, 1, 1, 14, 1, 1, 1, 60), Z.valueOf(30));
  }
}
