package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040931 Continued fraction for <code>sqrt(963)</code>.
 * @author Georg Fischer
 */
public class A040931 extends PrependSequence {

  /** Construct the sequence. */
  public A040931() {
    super(new PeriodicSequence(31, 62), Z.valueOf(31));
  }
}
