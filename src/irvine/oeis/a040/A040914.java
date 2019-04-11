package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040914 Continued fraction for <code>sqrt(945)</code>.
 * @author Georg Fischer
 */
public class A040914 extends PrependSequence {

  /** Construct the sequence. */
  public A040914() {
    super(new PeriodicSequence(1, 2, 1, 6, 12, 6, 1, 2, 1, 60), Z.valueOf(30));
  }
}
