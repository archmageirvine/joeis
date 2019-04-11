package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040941 Continued fraction for <code>sqrt(973)</code>.
 * @author Georg Fischer
 */
public class A040941 extends PrependSequence {

  /** Construct the sequence. */
  public A040941() {
    super(new PeriodicSequence(5, 5, 2, 8, 2, 5, 5, 62), Z.valueOf(31));
  }
}
