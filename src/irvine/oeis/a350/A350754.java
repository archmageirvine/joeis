package irvine.oeis.a350;
// manually deris/eulerx at 2022-10-26 11:22

import irvine.oeis.SkipSequence;
import irvine.oeis.a035.A035512;
import irvine.oeis.transform.EulerTransform;

/**
 * A350754 Number of semi-strong digraphs on n unlabeled nodes.
 * @author Georg Fischer
 */
public class A350754 extends EulerTransform {

  /** Construct the sequence. */
  public A350754() {
    super(new SkipSequence(new A035512(), 1), 1);
  }
}
