package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040810 Continued fraction for <code>sqrt(839)</code>.
 * @author Georg Fischer
 */
public class A040810 extends PrependSequence {

  /** Construct the sequence. */
  public A040810() {
    super(new PeriodicSequence(1, 27, 1, 56), Z.valueOf(28));
  }
}
