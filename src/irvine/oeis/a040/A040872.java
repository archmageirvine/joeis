package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040872 Continued fraction for <code>sqrt(903)</code>.
 * @author Georg Fischer
 */
public class A040872 extends PrependSequence {

  /** Construct the sequence. */
  public A040872() {
    super(new PeriodicSequence(20, 60), Z.valueOf(30));
  }
}
