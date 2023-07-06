package irvine.oeis.a052;
// manually euleras A004111 at 2021-11-23 09:22

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.a004.A004111;

/**
 * A052843 A simple grammar.
 * @author Georg Fischer
 */
public class A052843 extends EulerTransform {

  /** Construct the sequence. */
  public A052843() {
    super(new A004111().skip(1), 1, 1);
    next();
  }
}
