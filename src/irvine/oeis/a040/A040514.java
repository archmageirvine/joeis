package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040514 Continued fraction for sqrt(538).
 * @author Georg Fischer
 */
public class A040514 extends PrependSequence {

  /** Construct the sequence. */
  public A040514() {
    super(new PeriodicSequence(5, 7, 1, 1, 7, 5, 46), Z.valueOf(23));
  }
}
