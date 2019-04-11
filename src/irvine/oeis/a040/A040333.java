package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040333 Continued fraction for <code>sqrt(352)</code>.
 * @author Georg Fischer
 */
public class A040333 extends PrependSequence {

  /** Construct the sequence. */
  public A040333() {
    super(new PeriodicSequence(1, 3, 5, 9, 5, 3, 1, 36), Z.valueOf(18));
  }
}
