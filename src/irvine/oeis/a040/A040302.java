package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040302 Continued fraction for sqrt(320).
 * @author Georg Fischer
 */
public class A040302 extends PrependSequence {

  /** Construct the sequence. */
  public A040302() {
    super(new PeriodicSequence(1, 7, 1, 34), Z.valueOf(17));
  }
}
