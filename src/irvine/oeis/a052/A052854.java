package irvine.oeis.a052;
// manually 2021-07-06

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.a000.A000108;

/**
 * A052854 Number of forests of ordered trees on n total nodes.
 * @author Georg Fischer
 */
public class A052854 extends EulerTransform {

  /** Construct the sequence. */
  public A052854() {
    super(new A000108(), 1L);
  }
}
