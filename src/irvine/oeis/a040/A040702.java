package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040702 Continued fraction for <code>sqrt(730)</code>.
 * @author Georg Fischer
 */
public class A040702 extends PrependSequence {

  /** Construct the sequence. */
  public A040702() {
    super(new PeriodicSequence(54), Z.valueOf(27));
  }
}
