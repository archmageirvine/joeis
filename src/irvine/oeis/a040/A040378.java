package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040378 Continued fraction for sqrt(398).
 * @author Georg Fischer
 */
public class A040378 extends PrependSequence {

  /** Construct the sequence. */
  public A040378() {
    super(new PeriodicSequence(1, 18, 1, 38), Z.valueOf(19));
  }
}
