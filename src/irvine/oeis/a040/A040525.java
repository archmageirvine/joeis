package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040525 Continued fraction for <code>sqrt(549)</code>.
 * @author Georg Fischer
 */
public class A040525 extends PrependSequence {

  /** Construct the sequence. */
  public A040525() {
    super(new PeriodicSequence(2, 3, 9, 11, 1, 1, 1, 1, 4, 1, 1, 1, 1, 11, 9, 3, 2, 46), Z.valueOf(23));
  }
}
