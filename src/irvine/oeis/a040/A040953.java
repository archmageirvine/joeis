package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040953 Continued fraction for sqrt(985).
 * @author Georg Fischer
 */
public class A040953 extends PrependSequence {

  /** Construct the sequence. */
  public A040953() {
    super(new PeriodicSequence(2, 1, 1, 2, 62), Z.valueOf(31));
  }
}
