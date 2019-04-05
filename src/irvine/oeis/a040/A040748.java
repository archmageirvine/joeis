package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040748 Continued fraction for sqrt(776).
 * @author Georg Fischer
 */
public class A040748 extends PrependSequence {

  /** Construct the sequence. */
  public A040748() {
    super(new PeriodicSequence(1, 5, 1, 54), Z.valueOf(27));
  }
}
