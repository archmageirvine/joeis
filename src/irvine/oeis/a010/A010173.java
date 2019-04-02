package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010173 Continued fraction for sqrt(107).
 * @author Sean A. Irvine
 */
public class A010173 extends PrependSequence {

  /** Construct the sequence. */
  public A010173() {
    super(new PeriodicSequence(2, 1, 9, 1, 2, 20), Z.TEN);
  }
}

