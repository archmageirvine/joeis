package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040323 Continued fraction for sqrt(342).
 * @author Georg Fischer
 */
public class A040323 extends PrependSequence {

  /** Construct the sequence. */
  public A040323() {
    super(new PeriodicSequence(2, 36), Z.valueOf(18));
  }
}
