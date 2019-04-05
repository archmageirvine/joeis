package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040527 Continued fraction for sqrt(551).
 * @author Georg Fischer
 */
public class A040527 extends PrependSequence {

  /** Construct the sequence. */
  public A040527() {
    super(new PeriodicSequence(2, 8, 1, 8, 2, 46), Z.valueOf(23));
  }
}
