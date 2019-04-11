package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040917 Continued fraction for <code>sqrt(948)</code>.
 * @author Georg Fischer
 */
public class A040917 extends PrependSequence {

  /** Construct the sequence. */
  public A040917() {
    super(new PeriodicSequence(1, 3, 1, 3, 20, 3, 1, 3, 1, 60), Z.valueOf(30));
  }
}
