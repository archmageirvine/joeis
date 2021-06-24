package irvine.oeis.a171;
// manually 2021-06-24

import irvine.math.z.Z;
import irvine.oeis.a004.A004761;

/**
 * A171757 Even numbers whose binary expansion begins 10.
 * @author Georg Fischer
 */
public class A171757 extends A004761 {

  /** Construct the sequence. */
  public A171757() {
  	super.next();
  }
  
  @Override
  public Z next() {
    return super.next().multiply2();
  } // next
}
