package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040563 Continued fraction for sqrt(588).
 * @author Georg Fischer
 */
public class A040563 extends PrependSequence {

  /** Construct the sequence. */
  public A040563() {
    super(new PeriodicSequence(4, 48), Z.valueOf(24));
  }
}
