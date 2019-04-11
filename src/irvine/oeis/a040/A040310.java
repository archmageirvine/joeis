package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040310 Continued fraction for <code>sqrt(329)</code>.
 * @author Georg Fischer
 */
public class A040310 extends PrependSequence {

  /** Construct the sequence. */
  public A040310() {
    super(new PeriodicSequence(7, 4, 2, 1, 1, 4, 1, 1, 2, 4, 7, 36), Z.valueOf(18));
  }
}
