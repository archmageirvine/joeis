package irvine.oeis.a053;

import irvine.oeis.transform.InverseEulerTransform;

/**
 * A053515 Number of connected directed 3-multigraphs on n nodes.
 * @author Sean A. Irvine
 */
public class A053515 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A053515() {
    super(1, new A053468(), 0);
    next();
  }
}
