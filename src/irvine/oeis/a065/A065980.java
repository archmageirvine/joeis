package irvine.oeis.a065;
// manually binomx at 2023-06-01 10:26

import irvine.oeis.a001.A001923;
import irvine.oeis.transform.BinomialTransform;

/**
 * A065980 Inverse binomial transform of [1^1,2^2,3^3,...], shifted right by one index.
 * @author Georg Fischer
 */
public class A065980 extends BinomialTransform {

  /** Construct the sequence. */
  public A065980() {
    super(1, new A001923(), 0, true);
    next();
  }
}
