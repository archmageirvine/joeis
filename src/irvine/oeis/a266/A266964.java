package irvine.oeis.a266;
// manually 2020-11-30

import irvine.oeis.GeneralizedEulerTransform;
import irvine.oeis.a000.A000027;
import irvine.oeis.a001.A001478;

/**
 * A266964 Expansion of Product_{k&gt;=1} (1 - k*x^k)^k.
 * @author Georg Fischer
 */
public class A266964 extends GeneralizedEulerTransform {

  /** Construct the sequence */
  public A266964() {
    super(new A001478(), new A000027(), 1);
  }

}
