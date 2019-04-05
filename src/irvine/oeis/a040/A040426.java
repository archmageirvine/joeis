package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040426 Continued fraction for sqrt(448).
 * @author Georg Fischer
 */
public class A040426 extends PrependSequence {

  /** Construct the sequence. */
  public A040426() {
    super(new PeriodicSequence(6, 42), Z.valueOf(21));
  }
}
