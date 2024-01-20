package irvine.oeis.a026;

import irvine.oeis.a001.A001285;
import irvine.oeis.transform.RunLengthTransform;

/**
 * A026465 Length of n-th run of identical symbols in the Thue-Morse sequence A010060 (or A001285).
 * @author Sean A. Irvine
 */
public class A026465 extends RunLengthTransform {

  /** Construct the sequence. */
  public A026465() {
    super(1, new A001285());
  }
}
