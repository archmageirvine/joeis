package irvine.oeis.a101;

import irvine.oeis.a083.A083670;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A083659.
 * @author Sean A. Irvine
 */
public class A101460 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A101460() {
    super(0, new A083670(), 1, 1);
  }
}
