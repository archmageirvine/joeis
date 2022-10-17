package irvine.oeis.a103;
// manually A204574/parm3 at 2022-10-16 11:27

import irvine.oeis.a001.A001787;
import irvine.oeis.a204.A204574;
/**
 * A103175 A001787 written in base 2.
 * @author Georg Fischer
 */
public class A103175 extends A204574 {

  /** Construct the sequence. */
  public A103175() {
    super(0, new A001787(), 2);
  }
}
