package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040181 Continued fraction for sqrt(195).
 * @author Georg Fischer
 */
public class A040181 extends PrependSequence {

  /** Construct the sequence. */
  public A040181() {
    super(new PeriodicSequence(1, 26), Z.valueOf(13));
  }
}
