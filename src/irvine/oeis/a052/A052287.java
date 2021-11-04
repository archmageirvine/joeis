package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a047.A047836;

/**
 * A052287 Start with 3; the general rule is "if x is present then so is x*y for every y &lt;= x".
 * @author Sean A. Irvine
 */
public class A052287 extends A047836 {

  /** Construct the sequence. */
  public A052287() {
    super(Z.THREE);
  }
}
