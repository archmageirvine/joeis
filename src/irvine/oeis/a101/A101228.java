package irvine.oeis.a101;

import irvine.oeis.a003.A003087;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A101228 Number of weakly connected acyclic digraphs on n unlabeled nodes.
 * @author Gregory Morse
 */
public class A101228 extends InverseEulerTransform {
  /** Construct the sequence. */
  public A101228() {
    super(1, new A003087(), 1, new long[0]);
  }
}
