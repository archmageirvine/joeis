package irvine.oeis.a261;
// manually 2023-06-19

import irvine.math.z.Z;
import irvine.oeis.recur.HolonomicRecurrence;


/**
 * A261193 a(n) = n! - 2.
 * @author Georg Fischer
 */
public class A261193 extends HolonomicRecurrence {

  /**
   * Construct the sequence
   */
  public A261193() {
    super(0, "[[0],[0,1],[-1]]", "1", 0);
  }

  @Override
  public Z next() {
    return super.next().subtract(2);
  }
}
