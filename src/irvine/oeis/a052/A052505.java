package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A052505 Number of labeled 3-constrained functional graphs.
 *
 * @author Georg Fischer
 */
public class A052505 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A052505() {
    super(0, "[[0],[-36,-108,-117,-54,-9],[0],[0],[12, 8]]", "1, 0, 0", 3);
  }

  @Override
  public Z next() {
    Z result = super.next();
    while (result.isZero()) {
      result = super.next();
    }
    return result;
  }
}
