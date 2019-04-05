package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040900 Continued fraction for sqrt(931).
 * @author Georg Fischer
 */
public class A040900 extends PrependSequence {

  /** Construct the sequence. */
  public A040900() {
    super(new PeriodicSequence(1, 1, 19, 1, 5, 6, 1, 1, 1, 1, 2, 1, 1, 1, 1, 6, 5, 1, 19, 1, 1, 60), Z.valueOf(30));
  }
}
