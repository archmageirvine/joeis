package irvine.oeis.a169;
// manually A204574/parm3 at 2022-10-16 11:27

import irvine.oeis.a005.A005132;
import irvine.oeis.a204.A204574;
/**
 * A169631 Recamán&apos;s sequence (A005132) written in binary.
 * @author Georg Fischer
 */
public class A169631 extends A204574 {

  /** Construct the sequence. */
  public A169631() {
    super(0, new A005132(), 2);
  }
}
