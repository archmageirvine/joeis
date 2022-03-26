package irvine.oeis.a135;
// manually A057934/parm3 at 2022-03-25 22:28

import irvine.oeis.PrependSequence;
import irvine.oeis.a057.A057934;

/**
 * A135621 Number of prime factors of 11^n + 2 (counted with multiplicity).
 * @author Georg Fischer
 */
public class A135621 extends PrependSequence {

  /** Construct the sequence. */
  public A135621() {
    super(new A057934(11, 2), 1);
  }
}
