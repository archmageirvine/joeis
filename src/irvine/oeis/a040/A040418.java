package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040418 Continued fraction for <code>sqrt(439)</code>.
 * @author Georg Fischer
 */
public class A040418 extends PrependSequence {

  /** Construct the sequence. */
  public A040418() {
    super(new PeriodicSequence(1, 19, 1, 40), Z.valueOf(20));
  }
}
