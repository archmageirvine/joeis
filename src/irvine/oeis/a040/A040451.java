package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040451 Continued fraction for sqrt(473).
 * @author Georg Fischer
 */
public class A040451 extends PrependSequence {

  /** Construct the sequence. */
  public A040451() {
    super(new PeriodicSequence(1, 2, 1, 42), Z.valueOf(21));
  }
}
