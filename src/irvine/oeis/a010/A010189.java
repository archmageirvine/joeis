package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010189.
 * @author Sean A. Irvine
 */
public class A010189 extends PrependSequence {

  /** Construct the sequence. */
  public A010189() {
    super(new PeriodicSequence(3, 5, 3, 22), Z.valueOf(11));
  }
}

