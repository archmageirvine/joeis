package irvine.oeis.a052;

import irvine.oeis.EulerTransform;
import irvine.oeis.a032.A032175;

/**
 * A052806 Number of sequences of rooted identity trees with a total of n nodes.
 *
 * @author Georg Fischer
 */
public class A052806 extends EulerTransform {

  /**
   * Construct the sequence.
   */
  public A052806() {
    super(new A032175(), 1);
  }
}
