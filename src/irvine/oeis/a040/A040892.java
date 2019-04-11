package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040892 Continued fraction for <code>sqrt(923)</code>.
 * @author Georg Fischer
 */
public class A040892 extends PrependSequence {

  /** Construct the sequence. */
  public A040892() {
    super(new PeriodicSequence(2, 1, 1, 1, 2, 60), Z.valueOf(30));
  }
}
