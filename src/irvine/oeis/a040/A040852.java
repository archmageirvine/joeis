package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040852 Continued fraction for sqrt(882).
 * @author Georg Fischer
 */
public class A040852 extends PrependSequence {

  /** Construct the sequence. */
  public A040852() {
    super(new PeriodicSequence(1, 2, 3, 6, 3, 2, 1, 58), Z.valueOf(29));
  }
}
