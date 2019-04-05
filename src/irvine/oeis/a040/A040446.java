package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040446 Continued fraction for sqrt(468).
 * @author Georg Fischer
 */
public class A040446 extends PrependSequence {

  /** Construct the sequence. */
  public A040446() {
    super(new PeriodicSequence(1, 1, 1, 2, 1, 1, 1, 42), Z.valueOf(21));
  }
}
