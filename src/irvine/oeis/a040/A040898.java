package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040898 Continued fraction for sqrt(929).
 * @author Georg Fischer
 */
public class A040898 extends PrependSequence {

  /** Construct the sequence. */
  public A040898() {
    super(new PeriodicSequence(2, 11, 1, 2, 3, 2, 7, 5, 2, 2, 5, 7, 2, 3, 2, 1, 11, 2, 60), Z.valueOf(30));
  }
}
