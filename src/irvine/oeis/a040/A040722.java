package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040722 Continued fraction for <code>sqrt(750)</code>.
 * @author Georg Fischer
 */
public class A040722 extends PrependSequence {

  /** Construct the sequence. */
  public A040722() {
    super(new PeriodicSequence(2, 1, 1, 2, 3, 1, 1, 8, 1, 1, 3, 2, 1, 1, 2, 54), Z.valueOf(27));
  }
}
