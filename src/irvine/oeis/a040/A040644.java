package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040644 Continued fraction for sqrt(670).
 * @author Georg Fischer
 */
public class A040644 extends PrependSequence {

  /** Construct the sequence. */
  public A040644() {
    super(new PeriodicSequence(1, 7, 1, 1, 1, 5, 10, 5, 1, 1, 1, 7, 1, 50), Z.valueOf(25));
  }
}
