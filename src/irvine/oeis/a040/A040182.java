package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040182 Continued fraction for <code>sqrt(197)</code>.
 * @author Georg Fischer
 */
public class A040182 extends PrependSequence {

  /** Construct the sequence. */
  public A040182() {
    super(new PeriodicSequence(28), Z.valueOf(14));
  }
}
