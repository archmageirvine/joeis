package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040707 Continued fraction for <code>sqrt(735)</code>.
 * @author Georg Fischer
 */
public class A040707 extends PrependSequence {

  /** Construct the sequence. */
  public A040707() {
    super(new PeriodicSequence(9, 54), Z.valueOf(27));
  }
}
