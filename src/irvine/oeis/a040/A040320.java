package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040320 Continued fraction for sqrt(339).
 * @author Georg Fischer
 */
public class A040320 extends PrependSequence {

  /** Construct the sequence. */
  public A040320() {
    super(new PeriodicSequence(2, 2, 2, 1, 17, 1, 2, 2, 2, 36), Z.valueOf(18));
  }
}
