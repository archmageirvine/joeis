package irvine.oeis.a034;

import irvine.oeis.a020.A020802;
import irvine.oeis.a131.A131594;

/**
 * A034980 a(n)^2 is smallest positive square starting with a string of n 2's.
 * @author Sean A. Irvine
 */
public class A034980 extends A034982 {

  /** Construct the sequence. */
  public A034980() {
    // sqrt(45), sqrt(2)/3
    super(new A020802(), new A131594(), "2", null);
    setOffset(0);
  }
}
