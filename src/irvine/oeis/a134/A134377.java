package irvine.oeis.a134;
// manually binomx at 2023-06-01 10:26

import irvine.oeis.a045.A045621;
import irvine.oeis.transform.BinomialTransform;

/**
 * A134377 Binomial transform of A045621.
 * @author Georg Fischer
 */
public class A134377 extends BinomialTransform {

  /** Construct the sequence. */
  public A134377() {
    super(1, new A045621(), 1, false);
  }
}
