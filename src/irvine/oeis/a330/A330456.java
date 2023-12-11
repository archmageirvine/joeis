package irvine.oeis.a330;
// manually euleras at 2021-11-23 12:41

import irvine.oeis.a050.A050342;
import irvine.oeis.transform.EulerTransform;

/**
 * A330456 Number of multisets of nonempty sets of nonempty sets of positive integers with total sum n.
 * @author Georg Fischer
 */
public class A330456 extends EulerTransform {

  /** Construct the sequence. */
  public A330456() {
    super(new A050342().skip(1), 1);
  }
}
