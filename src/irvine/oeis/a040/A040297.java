package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040297 Continued fraction for <code>sqrt(315)</code>.
 * @author Georg Fischer
 */
public class A040297 extends PrependSequence {

  /** Construct the sequence. */
  public A040297() {
    super(new PeriodicSequence(1, 2, 1, 34), Z.valueOf(17));
  }
}
