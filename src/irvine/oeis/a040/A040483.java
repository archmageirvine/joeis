package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040483 Continued fraction for sqrt(506).
 * @author Georg Fischer
 */
public class A040483 extends PrependSequence {

  /** Construct the sequence. */
  public A040483() {
    super(new PeriodicSequence(2, 44), Z.valueOf(22));
  }
}
