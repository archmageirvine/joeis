package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040399 Continued fraction for <code>sqrt(420)</code>.
 * @author Georg Fischer
 */
public class A040399 extends PrependSequence {

  /** Construct the sequence. */
  public A040399() {
    super(new PeriodicSequence(2, 40), Z.valueOf(20));
  }
}
