package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040494 Continued fraction for sqrt(517).
 * @author Georg Fischer
 */
public class A040494 extends PrependSequence {

  /** Construct the sequence. */
  public A040494() {
    super(new PeriodicSequence(1, 2, 1, 4, 3, 3, 2, 10, 1, 14, 4, 14, 1, 10, 2, 3, 3, 4, 1, 2, 1, 44), Z.valueOf(22));
  }
}
