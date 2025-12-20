package irvine.oeis.a391;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a046.A046099;
import irvine.oeis.a303.A303946;

/**
 * A391415 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A391415 extends IntersectionSequence {

  /** Construct the sequence. */
  public A391415() {
    super(1, new A046099(), new A303946());
  }
}
