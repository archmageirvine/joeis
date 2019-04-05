package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040309 Continued fraction for sqrt(328).
 * @author Georg Fischer
 */
public class A040309 extends PrependSequence {

  /** Construct the sequence. */
  public A040309() {
    super(new PeriodicSequence(9, 36), Z.valueOf(18));
  }
}
