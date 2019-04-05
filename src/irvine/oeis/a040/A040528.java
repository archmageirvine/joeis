package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040528 Continued fraction for sqrt(552).
 * @author Georg Fischer
 */
public class A040528 extends PrependSequence {

  /** Construct the sequence. */
  public A040528() {
    super(new PeriodicSequence(2, 46), Z.valueOf(23));
  }
}
