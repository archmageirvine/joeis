package irvine.oeis.a051;
// manually div at 2021-08-20 23:03

import irvine.math.z.Z;
import irvine.oeis.a029.A029640;

/**
 * A051467 (Terms in A029640)/2.
 * @author Georg Fischer
 */
public class A051467 extends A029640 {

  /** Construct the sequence. */
  public A051467() {
    super.next(); // 2 was inserted
  }
  
  @Override
  public Z next() {
    return super.next().divide(2);
  }
}
