package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040600 Continued fraction for sqrt(626).
 * @author Georg Fischer
 */
public class A040600 extends PrependSequence {

  /** Construct the sequence. */
  public A040600() {
    super(new PeriodicSequence(50), Z.valueOf(25));
  }
}
