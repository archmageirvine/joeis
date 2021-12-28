package irvine.oeis.a053;

import irvine.oeis.a004.A004102;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A053465 Number of connected 2-multigraphs on n nodes.
 * @author Sean A. Irvine
 */
public class A053465 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A053465() {
    super(new A004102(), 1);
  }
}
