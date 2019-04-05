package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040637 Continued fraction for sqrt(663).
 * @author Georg Fischer
 */
public class A040637 extends PrependSequence {

  /** Construct the sequence. */
  public A040637() {
    super(new PeriodicSequence(1, 2, 1, 50), Z.valueOf(25));
  }
}
