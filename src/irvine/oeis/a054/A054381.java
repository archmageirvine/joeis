package irvine.oeis.a054;

import irvine.oeis.a049.A049370;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A054381 Number of n-node connected planar graphs with minimum degree at least 2.
 * @author Sean A. Irvine
 */
public class A054381 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A054381() {
    super(1, new A049370());
  }
}
