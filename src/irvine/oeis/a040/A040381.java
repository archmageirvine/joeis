package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040381 Continued fraction for sqrt(402).
 * @author Georg Fischer
 */
public class A040381 extends PrependSequence {

  /** Construct the sequence. */
  public A040381() {
    super(new PeriodicSequence(20, 40), Z.valueOf(20));
  }
}
