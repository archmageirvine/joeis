package irvine.oeis.a394;

import irvine.oeis.a339.A339832;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A394610 Number of connected bicolored graphs on n unlabeled nodes such that black nodes are not adjacent to each other.
 * @author Gregory Morse
 */
public class A394610 extends InverseEulerTransform {
  /** Construct the sequence. */
  public A394610() {
    super(new A339832(), 1);
  }
}
