package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040950 Continued fraction for sqrt(982).
 * @author Georg Fischer
 */
public class A040950 extends PrependSequence {

  /** Construct the sequence. */
  public A040950() {
    super(new PeriodicSequence(2, 1, 30, 1, 2, 62), Z.valueOf(31));
  }
}
