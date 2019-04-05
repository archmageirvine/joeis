package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040448 Continued fraction for sqrt(470).
 * @author Georg Fischer
 */
public class A040448 extends PrependSequence {

  /** Construct the sequence. */
  public A040448() {
    super(new PeriodicSequence(1, 2, 8, 2, 1, 42), Z.valueOf(21));
  }
}
