package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010155 Continued fraction for sqrt(77).
 * @author Sean A. Irvine
 */
public class A010155 extends PrependSequence {

  /** Construct the sequence. */
  public A010155() {
    super(new PeriodicSequence(1, 3, 2, 3, 1, 16), Z.EIGHT);
  }
}

