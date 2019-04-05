package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040783 Continued fraction for sqrt(812).
 * @author Georg Fischer
 */
public class A040783 extends PrependSequence {

  /** Construct the sequence. */
  public A040783() {
    super(new PeriodicSequence(2, 56), Z.valueOf(28));
  }
}
