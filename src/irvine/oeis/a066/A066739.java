package irvine.oeis.a066;
// manually euleras at 2021-11-23 12:41

import irvine.oeis.a001.A001055;
import irvine.oeis.transform.EulerTransform;

/**
 * A066739 Number of representations of n as a sum of products of positive integers. 1 is not allowed as a factor, unless it is the only factor. Representations which differ only in the order of terms or factors are considered equivalent.
 * @author Georg Fischer
 */
public class A066739 extends EulerTransform {

  /** Construct the sequence. */
  public A066739() {
    super(new A001055(), 1);
  }
}
