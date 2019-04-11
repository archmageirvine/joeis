package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040339 Continued fraction for <code>sqrt(358)</code>.
 * @author Georg Fischer
 */
public class A040339 extends PrependSequence {

  /** Construct the sequence. */
  public A040339() {
    super(new PeriodicSequence(1, 11, 1, 1, 1, 3, 1, 1, 4, 1, 5, 2, 18, 2, 5, 1, 4, 1, 1, 3, 1, 1, 1, 11, 1, 36), Z.valueOf(18));
  }
}
