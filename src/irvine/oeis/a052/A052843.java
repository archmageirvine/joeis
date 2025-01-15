package irvine.oeis.a052;
// manually euleras A004111 at 2021-11-23 09:22

import irvine.oeis.a004.A004111;
import irvine.oeis.transform.EulerTransform;

/**
 * A052843 a(n) is the number of forests with n nodes of rooted unlabeled identity trees.
 * @author Georg Fischer
 */
public class A052843 extends EulerTransform {

  /** Construct the sequence. */
  public A052843() {
    super(new A004111().skip(1), 1, 1);
    next();
  }
}
