package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040518 Continued fraction for sqrt(542).
 * @author Georg Fischer
 */
public class A040518 extends PrependSequence {

  /** Construct the sequence. */
  public A040518() {
    super(new PeriodicSequence(3, 1, 1, 3, 1, 1, 1, 22, 1, 1, 1, 3, 1, 1, 3, 46), Z.valueOf(23));
  }
}
