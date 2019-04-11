package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040766 Continued fraction for <code>sqrt(795)</code>.
 * @author Georg Fischer
 */
public class A040766 extends PrependSequence {

  /** Construct the sequence. */
  public A040766() {
    super(new PeriodicSequence(5, 9, 5, 56), Z.valueOf(28));
  }
}
